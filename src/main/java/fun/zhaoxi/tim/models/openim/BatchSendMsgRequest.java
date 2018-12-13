package fun.zhaoxi.tim.models.openim;

import fun.zhaoxi.tim.models.base.RequestBase;
import fun.zhaoxi.tim.models.msgelem.MsgElementBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class BatchSendMsgRequest extends RequestBase<BatchSendMsgResponse> {
    private Integer SyncOtherMachine;
    private String From_Account;
    private String[] To_Account;
    private Integer MsgRandom;
    private MsgElementBase[] MsgBody;
    private OfflinePushInfo OfflinePushInfo;

    @Override
    public Class getResponseClass() {
        return BatchSendMsgResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/openim/batchsendmsg";
    }
}
