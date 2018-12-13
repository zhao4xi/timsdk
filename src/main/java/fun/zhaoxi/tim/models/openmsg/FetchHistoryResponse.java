package fun.zhaoxi.tim.models.openmsg;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
public class FetchHistoryResponse extends ResponseBase {

    /**
     * 消息记录文件下载信息
     */
    private FetchHistoryFile[] File;

    /**
     * 类型
     * Group/ C2C
     */
    private String ChatType;

    /**
     * 消息时间
     */
    private String MsgTime;
    
}
