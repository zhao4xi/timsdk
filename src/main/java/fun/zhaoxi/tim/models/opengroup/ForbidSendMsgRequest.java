package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class ForbidSendMsgRequest extends RequestBase<ForbidSendMsgResponse> {

    private String GroupId;
    private String[] Members_Account;
    private int ShutUpTime;

    @Override
    public Class getResponseClass() {
        return ForbidSendMsgResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/forbid_send_msg";
    }
}
