package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class BlackListGetResponse extends ResponseBase {

    private FriendBlackListItem[] BlackListItem;
    private int StartIndex;
    private int CurruentSequence;
    private String ErrorDisplay;

}
