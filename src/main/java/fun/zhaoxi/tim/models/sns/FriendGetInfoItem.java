package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.profile.ProfileitemModel;
import lombok.Data;

@Data
public class FriendGetInfoItem {
    private String Info_Account;
    private ProfileitemModel[] SnsProfileItem;
}
