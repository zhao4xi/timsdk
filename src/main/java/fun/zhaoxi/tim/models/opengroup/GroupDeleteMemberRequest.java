package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupDeleteMemberRequest extends RequestBase<GroupDeleteMemberResponse> {

    /**
     * 群编号
     */
    private String GroupId;

    /**
     * 删除列表的账号
     */
    private String[] MemberToDel_Account;

    /** 
     * 是否静默删除 1: 是 0: 否
     */
    private Integer Silence;

    /**
     * 原因
     */
    private String Reason;

    @Override
    public Class getResponseClass() {
        return GroupDeleteMemberResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/delete_group_member";
    }
}
