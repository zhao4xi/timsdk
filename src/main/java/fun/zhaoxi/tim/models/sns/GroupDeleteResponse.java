package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupDeleteResponse extends ResponseBase {
    private int CurrentSequence;
    private String ErrorDisplay;
}
