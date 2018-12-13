package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetGroupInfoRequest extends RequestBase<GetGroupInfoResponse> {

    private String[] GroupIdList;

    private fun.zhaoxi.tim.models.opengroup.ResponseFilter ResponseFilter;

    @Override
    public Class getResponseClass() {
        return GetGroupInfoResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/get_group_info";
    }
}
