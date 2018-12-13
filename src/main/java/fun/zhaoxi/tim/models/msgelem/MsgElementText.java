package fun.zhaoxi.tim.models.msgelem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class MsgElementText extends MsgElementBase {

    public MsgElementText() {
        MsgType = "TIMTextElem";
    }

    private String MsgType;

    private MsgElementTextContent MsgContent;
}
