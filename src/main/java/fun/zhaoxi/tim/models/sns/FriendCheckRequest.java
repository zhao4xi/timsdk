package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendCheckRequest extends RequestBase<FriendCheckResponse> {
    private String From_Account;
    private String[] To_Account;
    private String CheckType;

    @Override
    public Class getResponseClass() {
        return FriendCheckResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/friend_check";
    }
}
