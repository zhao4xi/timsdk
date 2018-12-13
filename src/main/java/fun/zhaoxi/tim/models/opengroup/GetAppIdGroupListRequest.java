package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetAppIdGroupListRequest extends RequestBase<GetAppIdGroupListResponse> {

    private Integer Limit;
    private Integer Next;
    private String GroupType;

    @Override
    public Class getResponseClass() {
        return GetAppIdGroupListResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/get_appid_group_list";
    }
}
