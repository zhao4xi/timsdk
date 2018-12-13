package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class BlackListCheckRequest extends RequestBase<BlackListCheckResponse> {

    private String From_Account;
    private String[] To_Account;
    //BlackCheckResult_Type_Singal 只会检查From_Account的黑名单中是否有To_Account，不会检查To_Account的黑名单中是否有From_Account。
    //BlackCheckResult_Type_Both 既会检查From_Account的黑名单中是否有To_Account，也会检查To_Account的黑名单中是否有From_Account。
    private String CheckType;

    @Override
    public Class getResponseClass() {
        return BlackListCheckResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/black_list_check";
    }
}
