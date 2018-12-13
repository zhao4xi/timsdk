package fun.zhaoxi.tim.models.sns;

import lombok.Data;

@Data
public class UpdateItemModel {
    private String To_Account ;
    private SnsItemModel[] SnsItem ;
}
