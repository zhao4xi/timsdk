package fun.zhaoxi.tim.models.openimdirtywords;

import fun.zhaoxi.tim.models.base.RequestBase;

public class DirtyWordsGetRequest extends RequestBase<DirtyWordsGetResponse> {

    @Override
    public Class getResponseClass() {
        return DirtyWordsGetResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/openim_dirty_words/get";
    }
}
