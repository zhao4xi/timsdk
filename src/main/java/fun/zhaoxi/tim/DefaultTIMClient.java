package fun.zhaoxi.tim;

import com.google.gson.Gson;
import fun.zhaoxi.tim.models.base.RequestBase;
import fun.zhaoxi.tim.models.base.ResponseBase;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;

/**
 * TimClient
 */
public class DefaultTIMClient {

    private TIMSdkConfig sdkConfig;

    /**
     * 初始化TIM请求对象
     *
     * @param sdkConfig
     */
    public DefaultTIMClient(TIMSdkConfig sdkConfig) {
        this.sdkConfig = sdkConfig;
    }

    /**
     * 执行请求
     *
     * @param request 请求的参数
     * @param <T>     返回的类型
     * @return 返回TIMResponse
     */
    public <T extends ResponseBase> T execute(RequestBase<T> request) {
        String realUrl = getRealUrl(request);
        Gson gson = new Gson();
        String jsonData = gson.toJson(request);
        System.out.println(jsonData);
        String responseData = doPost(realUrl, jsonData);
        return (T) gson.fromJson(responseData, request.getResponseClass());
    }

    private String getRealUrl(RequestBase request) {
        StringBuilder StringBuilder = new StringBuilder();
        StringBuilder.append(sdkConfig.getBaseUrl());
        StringBuilder.append(request.getResource());
        StringBuilder.append("?contenttype=json");
        StringBuilder.append("&random=");
        StringBuilder.append(new Date().getTime());
        StringBuilder.append("&sdkappid=");
        StringBuilder.append(sdkConfig.getSdkAppId());
        StringBuilder.append("&identifier=");
        StringBuilder.append(sdkConfig.getIdentifier());
        StringBuilder.append("&usersig=");
        StringBuilder.append(sdkConfig.getUserSign());

        return StringBuilder.toString();
    }

    private String doPost(String url, String postJsonBody) {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json");
        StringEntity entity = new StringEntity(postJsonBody, Charset.forName("UTF-8"));
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        try {
            HttpResponse response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toString(response.getEntity(), Charset.forName("UTF-8"));
            } else {
                throw new TIMSdkException("post result error: " + response.getStatusLine().getStatusCode());
            }
        } catch (IOException ex) {
            throw new TIMSdkException(ex);
        }
    }
}
