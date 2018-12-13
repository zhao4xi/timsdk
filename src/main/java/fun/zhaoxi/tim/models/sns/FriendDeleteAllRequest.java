package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendDeleteAllRequest extends RequestBase<FriendDeleteAllResponse> {
    private String From_Account;

    @Override
    public Class getResponseClass() {
        return FriendDeleteAllResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/friend_delete_all";
    }
}
