package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendImportRequest extends RequestBase<FriendImportResponse> {
    private String From_Account;
    private AddFriendItemModel[] AddFriendItem;

    @Override
    public Class getResponseClass() {
        return FriendImportResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/friend_import";
    }
}
