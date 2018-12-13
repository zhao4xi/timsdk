package fun.zhaoxi.tim.models.openconfig;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetNoSpeakingRequest extends RequestBase<GetNoSpeakingResponse> {

    private String Get_Account;

    @Override
    public Class getResponseClass() {
        return GetNoSpeakingResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/openconfigsvr/getnospeaking";
    }
}
