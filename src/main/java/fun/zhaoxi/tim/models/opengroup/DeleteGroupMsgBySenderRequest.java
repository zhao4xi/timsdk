package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class DeleteGroupMsgBySenderRequest extends RequestBase<DeleteGroupMsgBySenderResponse> {

    private String GroupId;
    private String Sender_Account;

    @Override
    public Class getResponseClass() {
        return DeleteGroupMsgBySenderResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/delete_group_msg_by_sender";
    }
}
