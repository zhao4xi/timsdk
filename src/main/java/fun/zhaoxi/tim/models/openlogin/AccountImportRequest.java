package fun.zhaoxi.tim.models.openlogin;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class AccountImportRequest extends RequestBase<AccountImportResponse> {

    /**
     * 用户名，长度不超过 32 字节
     */
    private String Identifier;
    /**
     * 用户昵称
     */
    private String Nick;
    /**
     * 用户头像URL
     */
    private String FaceUrl;
    /**
     * 帐号类型，开发者默认无需填写，值0表示普通帐号，1表示机器人帐号。
     */
   private Integer Type;

    @Override
    public Class getResponseClass() {
        return AccountImportResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/im_open_login_svc/account_import";
    }
}
