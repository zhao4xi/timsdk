package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendAddRequest extends RequestBase<FriendAddResponse> {
    private String From_Account;
    private AddFriendItemModel[] AddFriendItem;
    private String AddType;
    private Integer ForceAddFlags;

    @Override
    public Class getResponseClass() {
        return FriendAddResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/friend_add";
    }
}
