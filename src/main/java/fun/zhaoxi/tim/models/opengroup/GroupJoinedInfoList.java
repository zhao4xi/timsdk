package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class GroupJoinedInfoList {

    private String GroupId;

    private String Type;

    private int LastMsgTime;

    private int MemberCount;

    private String ShutUpAllMember;

    private SelfInfo SelfInfo;

}
@Data
class SelfInfo {
    private String Role;

    private String MsgFlag;

    private int UnreadMsgNum;
}
