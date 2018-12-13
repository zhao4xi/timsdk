package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class SendGroupMsgResponse extends ResponseBase {
    /**
     * 消息时间
     */
    private int MsgTime;
    /**
     * 消息序列
     */
    private int MsgSeq;

}
