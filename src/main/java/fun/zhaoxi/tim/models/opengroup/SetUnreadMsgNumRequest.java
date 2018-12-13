package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class SetUnreadMsgNumRequest extends RequestBase<SetUnreadMsgNumResponse> {

    private String GroupId;
    private String Member_Account;
    private int UnreadMsgNum;

    @Override
    public Class getResponseClass() {
        return SetUnreadMsgNumResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/set_unread_msg_num";
    }
}
