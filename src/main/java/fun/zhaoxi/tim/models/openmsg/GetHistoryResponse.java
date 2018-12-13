package fun.zhaoxi.tim.models.openmsg;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetHistoryResponse extends ResponseBase {
    private List<HistoryFile> File;
}
