package fun.zhaoxi.tim.models.profile;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class PortraitGetResponse extends ResponseBase {

    private String ErrorDisplay;
}
