package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class AppDefinedDataModel {
    /**
     * 自定义: Rooms
     */
    private String Key;
    /**
     * RoomId RoomName 的键值对 Map
     */
    private String Value;

}
