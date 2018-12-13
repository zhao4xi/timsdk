package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class BlackListDeleteRequest extends RequestBase<BlackListDeleteResponse> {

    private String From_Account;
    private String[] To_Account;

    @Override
    public Class getResponseClass() {
        return BlackListDeleteResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/black_list_delete";
    }
}
