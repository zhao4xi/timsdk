package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class ShuttedUinListModel {
    private String Member_Account;
    //时间戳UTC时间
    private long ShuttedUntil;

}
