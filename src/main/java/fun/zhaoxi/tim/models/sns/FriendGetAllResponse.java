package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendGetAllResponse extends ResponseBase {

    private String NeedUpdateAll;

    private int TimeStampNow;

    private int StartIndex;

    private FriendGetInfoItem[] InfoItem ;

    private int CurrentStandardSequence;

    private int FriendNum;

    private String ErrorDisplay;

}
