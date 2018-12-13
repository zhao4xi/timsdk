package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class MemberList {

    private String Member_Account;
    private String Role;
    private Integer JoinTime;
    private Integer MsgSeq;
    private String MsgFlag;
    private Integer LastSendMsgTime;
    private Integer ShutUpUntil;
    private AppDefined[] AppMemberDefinedData;

}
