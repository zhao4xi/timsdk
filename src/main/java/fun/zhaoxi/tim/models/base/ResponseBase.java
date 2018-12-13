package fun.zhaoxi.tim.models.base;


/**
 * 响应基类
 */
public abstract class ResponseBase {
    /**
     * 请求处理的结果，OK表示处理成功，FAIL表示失败。
     */
    private String ActionStatus;
    /**
     * 错误信息。
     */
    private String ErrorInfo;
    /**
     * 错误码。
     */
    private int ErrorCode;

    /**
     * 请求是否成功
     * 请求成功不代表子业务执行成功
     * @return true 请求成功, false 请求失败
     */
    public boolean getSuccess() {
        return ActionStatus.equals("OK");
    } 
}
