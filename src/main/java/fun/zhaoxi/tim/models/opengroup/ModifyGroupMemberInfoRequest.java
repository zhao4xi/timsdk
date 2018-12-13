package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class ModifyGroupMemberInfoRequest extends RequestBase<ModifyGroupMemberInfoResponse> {

    /**
     * 群编号
     */
    private String GroupId;
    /**
     * 要操作的群成员
     */
    private String Member_Account;
    /**
     * Admin 管理员,  Member 成员
     */
    private String Role;
    /**
     * 消息屏蔽类型
     * AcceptAndNotify,
     * Discard,
     * AcceptNotNotify
     */
    private String MsgFlag;
    /**
     * 群名片（最大不超过50个字节）。
     */
    private String NameCard;
    /**
     * 自定义消息
     */
    private AppDefined[] AppMemberDefinedData;


    @Override
    public Class getResponseClass() {
        return ModifyGroupMemberInfoResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/modify_group_member_info";
    }
}
