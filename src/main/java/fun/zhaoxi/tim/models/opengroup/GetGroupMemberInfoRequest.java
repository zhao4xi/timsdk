package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetGroupMemberInfoRequest extends RequestBase<GetGroupMemberInfoResponse> {

    private String GroupId;
    //  "Role",
    //    "JoinTime",
    //    "MsgSeq",
    //    "MsgFlag",
    //    "LastSendMsgTime",
    //    "ShutUpUntil",
    //    "NameCard"
    private String[] MemberInfoFilter; //  需要获取哪些信息，如果没有该字段则为群成员全部资料

    private String[] MemberRoleFilter; // 群成员身份过滤器 "Owner", "Member"
    private String[] AppDefinedDataFilter_GroupMember; // 群成员自定义字段过滤器

    private int Limit;
    private int Offset;

    @Override
    public Class getResponseClass() {
        return GetGroupMemberInfoResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/get_group_member_info";
    }
}
