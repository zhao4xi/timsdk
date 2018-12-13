package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class GroupInfoMemberList {
    private String Member_Account;
    private String Role;
    private Long JoinTime;
    private Integer MsgSeq;
    private String MsgFlag;
    private Long LastSendMsgTime;
    private Long ShutUpUntil;
    private AppDefined[] AppMemberDefinedData;
}
