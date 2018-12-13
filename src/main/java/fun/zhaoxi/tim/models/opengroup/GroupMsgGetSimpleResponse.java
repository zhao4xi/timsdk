package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupMsgGetSimpleResponse extends ResponseBase {

    private String GroupId;
    private int IsFinished;
    private GroupResultMsg[] RspMsgList;

}
