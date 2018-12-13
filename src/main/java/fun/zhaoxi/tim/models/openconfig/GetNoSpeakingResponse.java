package fun.zhaoxi.tim.models.openconfig;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetNoSpeakingResponse extends ResponseBase {

    // 0: 取消禁言, max = 4294967295
    private Integer C2CmsgNospeakingTime;

    // 0: 取消禁言, max = 4294967295
    private Integer GroupmsgNospeakingTime;

}
