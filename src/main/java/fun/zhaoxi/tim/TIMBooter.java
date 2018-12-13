package fun.zhaoxi.tim;


import fun.zhaoxi.tim.models.opengroup.GetGroupInfoRequest;
import fun.zhaoxi.tim.models.opengroup.GetGroupInfoResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class TIMBooter {

    static String BASE_URL = "https://console.tim.qq.com/";
    static String IDENTIFIER = "your identifier";
    static Long SDK_APPID = 1L;// your sdk appid
    static String USER_SIGN = "your sign";

    public static void main(String[] args) {

        TIMSdkConfig config = new TIMSdkConfig();
        config.setBaseUrl(BASE_URL);
        config.setIdentifier(IDENTIFIER);
        config.setSdkAppId(SDK_APPID);
        config.setUserSign(USER_SIGN);

        TIMSdkService timSdkService = new TIMSdkServiceImpl(config);
        GetGroupInfoRequest request = new GetGroupInfoRequest();
        request.setGroupIdList(new String[]{"686b82cd67204ae6b2dbaf2dde96c40f"});
        request.setResponseFilter(null);
        GetGroupInfoResponse response = timSdkService.GetGroupInfo(request);

    }

}
