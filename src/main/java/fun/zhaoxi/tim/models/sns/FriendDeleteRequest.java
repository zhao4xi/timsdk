package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendDeleteRequest extends RequestBase<FriendDeleteResponse> {

    private String From_Account;
    /**
     * Delete_Type_Single
     * Delete_Type_Both
     */
    private String DeleteType;
    /**
     * 待删除的好友的 Identifier 列表，单次请求的 To_Account 数不得超过 1000
     */
    private String[] To_Account;

    @Override
    public Class getResponseClass() {
        return FriendDeleteResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/friend_delete";
    }
}
