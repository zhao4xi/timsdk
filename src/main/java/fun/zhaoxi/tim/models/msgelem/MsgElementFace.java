package fun.zhaoxi.tim.models.msgelem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class MsgElementFace extends MsgElementBase {
    public MsgElementFace() {
        MsgType = "TIMFaceElem";
    }

    private String MsgType;
    private MsgElementFaceContent MsgContent;
}
