package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendUpdateRequest extends RequestBase<FriendUpdateResponse> {
    private String From_Account;
    private UpdateItemModel[] UpdateItem;

    @Override
    public Class getResponseClass() {
        return FriendUpdateResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/friend_update";
    }
}
