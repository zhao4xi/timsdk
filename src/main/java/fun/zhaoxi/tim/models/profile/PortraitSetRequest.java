package fun.zhaoxi.tim.models.profile;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class PortraitSetRequest extends RequestBase<PortraitSetResponse> {

    private String From_Account;
    private ProfileitemModel[] ProfileItem;

    @Override
    public Class getResponseClass() {
        return PortraitSetResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/profile/portrait_set";
    }
}
