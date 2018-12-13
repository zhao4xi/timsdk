package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class MemberListModel {
    /**
     * 成员编号
     */
    private String Member_Account;

    /**
     * 导入成员的角色，目前只有 Admin(可选)
     */
    private String Role;

    /**
     * 导入的成员入群时间（选填）
     */
    private Integer JoinTime;

    /**
     * 该成员的未读消息数（选填）
     */
    private Integer UnreadMsgNum;

}
