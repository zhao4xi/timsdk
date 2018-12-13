package fun.zhaoxi.tim.models.openlogin;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 批量导入响应
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class AccountMultiImportResponse extends ResponseBase {
    /**
     * 导入失败的帐号列表
     */
    private String[] FailAccounts;
}
