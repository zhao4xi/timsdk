package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupMsgGetSimpleRequest extends RequestBase<GroupMsgGetSimpleResponse> {

    private String GroupId;
    //max = 20
    private int ReqMsgNumber;
    private Integer ReqMsgSeq;

    @Override
    public Class getResponseClass() {
        return GroupMsgGetSimpleResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/group_msg_get_simple";
    }
}
