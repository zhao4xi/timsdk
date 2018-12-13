package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class GroupInfo {
    private String GroupId;
    private int ErrorCode;
    private String ErrorInfo;
    private String Type;
    private String Name;
    private String Introduction;
    private String Notification;
    private String FaceUrl;
    private String Owner_Account;
    private long CreateTime;
    private long LastInfoTime;
    private long LastMsgTime;
    private int NextMsgSeq;
    private int MemberNum;
    private int MaxMemberNum;
    private String ApplyJoinOption;
    private String ShutUpAllMember;
    private AppDefined[] AppDefinedData;
    private GroupInfoMemberList[] MemberList;
}
