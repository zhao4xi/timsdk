package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupAddMemberRequest extends RequestBase<GroupAddMemberResponse> {

    /**
     * 群编号
     */
    private String GroupId;

    /**
     * 静默加群
     */
    private Integer Silence = 1;
    
    /**
     * 群成员
     */
    private MemberListRequestModel[] MemberList;


    @Override
    public Class getResponseClass() {
        return GroupAddMemberResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/add_group_member";
    }
}
