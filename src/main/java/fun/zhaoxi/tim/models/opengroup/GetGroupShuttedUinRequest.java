package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetGroupShuttedUinRequest extends RequestBase<GetGroupShuttedUinResponse> {

    private String GroupId;

    @Override
    public Class getResponseClass() {
        return GetGroupShuttedUinResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/get_group_shutted_uin";
    }
}
