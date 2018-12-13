package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendGetListResponse extends ResponseBase {

    private String ErrorDisplay;
    private String[] Fail_Account;
    private String[] Invalid_Account;
    private FriendInfoModel[] FriendInfo;
}
