package fun.zhaoxi.tim.models.openim;

import fun.zhaoxi.tim.models.base.RequestBase;
import fun.zhaoxi.tim.models.msgelem.MsgElementBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class ImportMsgRequest extends RequestBase<ImportMsgResponse> {

    private int SyncFromOldSystem;
    private String From_Account;
    private String To_Account;
    private long MsgRandom;
    private Long MsgTimeStamp;
    private MsgElementBase[] MsgBody;

    @Override
    public String getResource() {
        return "v4/openim/importmsg";
    }

    @Override
    public Class getResponseClass() {
        return ImportMsgResponse.class;
    }
}
