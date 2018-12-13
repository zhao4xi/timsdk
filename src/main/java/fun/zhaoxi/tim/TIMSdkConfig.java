package fun.zhaoxi.tim;

import lombok.Data;

/**
 * Tim 配置文件
 */
@Data
public class TIMSdkConfig {

    /**
     * BaseUrl
     */
    private String baseUrl;

    /**
     * sdkAppId
     */
    private Long sdkAppId;

    /**
     * 管理员签名
     */
    private String userSign;

    /**
     * 管理员账号
     */
    private String identifier;

    /**
     * 加密私钥
     */
    private String privateKey;

    /**
     * 加密公钥
     */
    private String publicKey;
}
