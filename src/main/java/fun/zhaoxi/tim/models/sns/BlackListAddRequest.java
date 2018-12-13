package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class BlackListAddRequest extends RequestBase<BlackListAddResponse> {

    private String From_Account;
    private String[] To_Account;

    @Override
    public Class getResponseClass() {
        return BlackListAddResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/black_list_add";
    }
}
