package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.msgelem.MsgElementBase;
import lombok.Data;

import java.util.List;

@Data
public class GroupResultMsg {

    private String From_Account;

    private int IsPlaceMsg;

    private List<MsgElementBase> MsgBody ;

    private int MsgRandom;

    private int MsgSeq;

    private int MsgTimeStamp;
}
