package fun.zhaoxi.tim.models.openim;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class BatchSendMsgResponse extends ResponseBase {
    private ErrorList[] ErrorList;
}
