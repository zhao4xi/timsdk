package fun.zhaoxi.tim;

public class TIMSdkException extends RuntimeException {
    private static final long serialVersionUID = -238091758285157331L;
    private String errCode;
    private String errMsg;

    public TIMSdkException() {
    }

    public TIMSdkException(String message, Throwable cause) {
        super(message, cause);
    }

    public TIMSdkException(String message) {
        super(message);
    }

    public TIMSdkException(Throwable cause) {
        super(cause);
    }

    public TIMSdkException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }
}
