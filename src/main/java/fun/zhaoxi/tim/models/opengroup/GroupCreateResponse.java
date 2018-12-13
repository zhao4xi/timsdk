package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupCreateResponse extends ResponseBase {
    private String GroupId;
}
