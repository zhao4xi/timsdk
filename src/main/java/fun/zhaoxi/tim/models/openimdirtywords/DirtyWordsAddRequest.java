package fun.zhaoxi.tim.models.openimdirtywords;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class DirtyWordsAddRequest extends RequestBase<DirtyWordsAddResponse> {
    private String[] DirtyWordsList;

    @Override
    public Class getResponseClass() {
        return DirtyWordsAddResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/openim_dirty_words/add";
    }
}
