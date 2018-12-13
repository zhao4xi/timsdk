package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import fun.zhaoxi.tim.models.msgelem.MsgElementBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class SendGroupMsgRequest extends RequestBase<SendGroupMsgResponse> {

    /**
     * 群组编号
     */
    private String GroupId;
    /**
     * 随机数字，五分钟数字相同认为是重复消息
     */
    private int Random;
    /**
     * 消息体，由一个element数组组成，详见字段说明
     */
    private MsgElementBase[] MsgBody;

    @Override
    public Class getResponseClass() {
        return SendGroupMsgResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/send_group_msg";
    }
}
