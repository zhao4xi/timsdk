package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import fun.zhaoxi.tim.models.msgelem.MsgListModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class ImportGroupMsgRequest extends RequestBase<ImportGroupMsgResponse> {

    private String GroupId;
    private MsgListModel[] MsgList;

    @Override
    public Class getResponseClass() {
        return ImportGroupMsgResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/import_group_msg";
    }
}
