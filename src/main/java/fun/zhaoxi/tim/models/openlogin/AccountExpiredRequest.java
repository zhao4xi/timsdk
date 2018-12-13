package fun.zhaoxi.tim.models.openlogin;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 账户过期请求
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class AccountExpiredRequest extends RequestBase<AccountExpiredResponse> {

    /**
     * 用户标识
     */
    public String Identifier ;

    @Override
    public Class getResponseClass() {
        return AccountExpiredResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/im_open_login_svc/kick";
    }
}
