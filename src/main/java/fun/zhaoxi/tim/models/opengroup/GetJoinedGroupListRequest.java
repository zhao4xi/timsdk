package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetJoinedGroupListRequest extends RequestBase<GetJoinedGroupListResponse> {
    private String Member_Account;

    private Integer Limit;
    private Integer Offset;
    private String GroupType;
    private GroupJoinedFilter ResponseFilter;

    @Override
    public Class getResponseClass() {
        return GetJoinedGroupListResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/get_joined_group_list";
    }
}
