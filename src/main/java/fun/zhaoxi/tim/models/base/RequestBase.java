package fun.zhaoxi.tim.models.base;


/**
 * 请求基类
 * @param <Response> 请求基类模板
 */
public abstract class RequestBase<Response extends ResponseBase> {

    /**
     * 获取响应的对象类型
     */
    public Class getResponseClass() {
        return ResponseBase.class;
    }

    /**
     * 获取请求的资源地址
     *
     * @return
     */
    public String getResource() {
        return "";
    }
}
