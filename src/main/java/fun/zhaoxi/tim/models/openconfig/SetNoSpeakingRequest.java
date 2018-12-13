package fun.zhaoxi.tim.models.openconfig;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class SetNoSpeakingRequest extends RequestBase<SetNoSpeakingResponse> {

    private String Set_Account;
    // 0: 取消禁言, max = 4294967295
    private Integer C2CmsgNospeakingTime;
    //C2CmsgNospeakingTime 和 GroupmsgNospeakingTime 是选填字段，但不能两个都不填
    private Integer GroupmsgNospeakingTime;

    @Override
    public Class getResponseClass() {
        return SetNoSpeakingResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/openconfigsvr/setnospeaking";
    }
}
