package fun.zhaoxi.tim.models.openim;

import lombok.Data;

@Data
public class OfflinePushInfo {
    private Integer PushFlag;
    private String Title;
    private String Desc;
    private String Ext;
    private AndroidInfo AndroidInfo;
    private ApnsInfo ApnsInfo;
}
