package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class SendGroupSystemNotificationRequest extends RequestBase<SendGroupSystemNotificationResponse> {
    /**
     * 群组id
     */
    private String GroupId;
    /**
     * 系统通知内容
     */
    private String Content;
    /**
     * 接收者群成员列表，不填或为空表示全员下发。
     */
    private String[] ToMembers_Account;

    @Override
    public Class getResponseClass() {
        return SendGroupSystemNotificationResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/send_group_system_notification";
    }
}
