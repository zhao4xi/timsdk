package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class MemberResultListModel {

    /**
     * 成员账号
     */
    private String Member_Account;
    /**
     *  导入结果：0为失败；1为成功；2表示已经是群成员
     */
    private int Result;

}
