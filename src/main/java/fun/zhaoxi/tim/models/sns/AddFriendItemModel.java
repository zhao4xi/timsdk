package fun.zhaoxi.tim.models.sns;

import lombok.Data;

@Data
public class AddFriendItemModel {
    /**
     * 好友的 Identifier
     */
    private String To_Account;
    /**
     * From_Account 对 To_Account 的好友备注，详情可参见 标配好友字段
     */
    private String Remark;
    /**
     * From_Account 对 To_Account 的分组信息，详情可参见标配好友字段
     */
    private String GroupName;
    /**
     * 加好友来源字段，详情可参见 标配好友字段
     * AddSource_Type_ 开头
     */
    private String AddSource;
    /**
     * From_Account 和 To_Account 形成好友关系时的附言信息
     */
    private String AddWording;

}
