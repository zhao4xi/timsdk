package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendGetListRequest extends RequestBase<FriendGetListResponse> {

    private String From_Account;
    private String[] To_Account;
    private String[] TagList;

    @Override
    public Class getResponseClass() {
        return FriendGetListResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/friend_get_list";
    }
}
