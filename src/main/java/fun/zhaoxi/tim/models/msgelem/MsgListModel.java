package fun.zhaoxi.tim.models.msgelem;

import lombok.Data;

import java.util.List;

@Data
public class MsgListModel {
    private String From_Account;

    private int SendTime;

    private Integer Random;

    private List<MsgElementBase> MsgBody ;
}
