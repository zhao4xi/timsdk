package fun.zhaoxi.tim.models.sns;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class BlackListGetRequest extends RequestBase<BlackListGetResponse> {

    private String From_Account;

    private int StartIndex;

    private int MaxLimited;

    private int LastSequence;

    @Override
    public Class getResponseClass() {
        return BlackListGetResponse. class;
    }

    @Override
    public String getResource() {
        return "v4/sns/black_list_get";
    }
}
