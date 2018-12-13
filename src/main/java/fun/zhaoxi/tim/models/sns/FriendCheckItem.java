package fun.zhaoxi.tim.models.sns;

import lombok.Data;

@Data
public class FriendCheckItem {
    private String To_Account;

    private String Relation;

    private int ResultCode;

    private String ResultInfo;
}
