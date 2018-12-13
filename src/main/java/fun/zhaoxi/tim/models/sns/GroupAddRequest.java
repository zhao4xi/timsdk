package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupAddRequest extends RequestBase<GroupAddResponse> {

    private String From_Account;
    private String[] GroupName;
    private String[] To_Account;

    @Override
    public Class getResponseClass() {
        return GroupAddRequest.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/group_add";
    }
}
