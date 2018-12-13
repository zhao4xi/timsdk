package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FriendGetAllRequest extends RequestBase<FriendGetAllResponse> {

    private String From_Account;

    private int TimeStamp;

    private int StartIndex;

    private String[] TagList ;

    private int LastStandardSequence;

    private int GetCount;

    @Override
    public Class getResponseClass() {
        return FriendGetAllResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/sns/friend_get_all";
    }
}
