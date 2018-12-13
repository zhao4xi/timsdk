package fun.zhaoxi.tim.models.sns;

import lombok.Data;

@Data
public class GroupAddResult {
    private String To_Account;

    private int ResultCode;

    private String ResultInfo;
}
