package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetRoleInGroupRequest extends RequestBase<GetRoleInGroupResponse> {
    private String GroupId;
    private String[] User_Account;


    @Override
    public Class getResponseClass() {
        return GetRoleInGroupResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/get_role_in_group";
    }
}
