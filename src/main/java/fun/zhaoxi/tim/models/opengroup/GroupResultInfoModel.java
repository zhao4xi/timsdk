package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class GroupResultInfoModel {
    private String GroupId;
    private Integer ErrorCode;
    private String ErrorInfo;
    private String Type;
    private String Name;
    private String Introduction;
    private String Notification;
    private String FaceUrl;
    private String Owner_Account;
    private Integer CreateTime;
    private Integer LastInfoTime;
    private Integer LastMsgTime;
    private Integer NextMsgSeq;
    private Integer MemberNum;
    private Integer MaxMemberNum;
    private String ApplyJoinOption;
    private String ShutUpAllMember;
    private AppDefined[] AppDefinedData;
    private fun.zhaoxi.tim.models.opengroup.MemberList[] MemberList;

}
