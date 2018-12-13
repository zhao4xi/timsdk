package fun.zhaoxi.tim.models.openlogin;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 批量账号导入
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class AccountMultiImportRequest extends RequestBase<AccountMultiImportResponse> {
    /**
     * 用户名，单个用户名长度不超过 32 字节，单次最多导入100个用户名
     */
    private String[] Account;

    @Override
    public Class getResponseClass() {
        return AccountMultiImportResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/im_open_login_svc/multiaccount_import";
    }
}
