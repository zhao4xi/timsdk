package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class ImportGroupMemberRequest extends RequestBase<ImportGroupMemberResponse> {
    /**
     * 群编号
     */
    private String GroupId;
    /**
     * 群成员列表
     */
    private MemberListModel[] MemberList;

    @Override
    public Class getResponseClass() {
        return ImportGroupMemberResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/import_group_member";
    }
}
