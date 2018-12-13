package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class ChangeGroupOwnerRequest extends RequestBase<ChangeGroupOwnerResponse> {

    private String GroupId;
    private String NewOwner_Account;

    @Override
    public Class getResponseClass() {
        return ChangeGroupOwnerResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/change_group_owner";
    }
}
