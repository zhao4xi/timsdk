package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupAddResponse extends ResponseBase {
    private GroupAddResult[] ResultItem;
    private String[] Fail_Account;
    private String[] Invalid_Account;
    private int CurrentSequence;
    private String ErrorDisplay;
}
