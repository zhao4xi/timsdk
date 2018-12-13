package fun.zhaoxi.tim.models.openimdirtywords;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class DirtyWordsDeleteRequest extends RequestBase<DirtyWordsDeleteResponse> {

    private String[] DirtyWordsList;

    @Override
    public Class getResponseClass() {
        return DirtyWordsDeleteResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/openim_dirty_words/delete";
    }
}
