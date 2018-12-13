package fun.zhaoxi.tim.models.openim;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
public class QueryStateResponse extends ResponseBase {

    public List<QueryStateResult> QueryResult;
}

