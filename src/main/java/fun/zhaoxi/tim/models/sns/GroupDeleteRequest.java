package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupDeleteRequest extends RequestBase<GroupDeleteResponse> {

    private String From_Account;
    private String[] GroupName;

    @Override
    public Class getResponseClass() {
        return GroupDeleteResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/group_delete";
    }
}
