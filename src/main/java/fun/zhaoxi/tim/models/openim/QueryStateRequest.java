package fun.zhaoxi.tim.models.openim;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class QueryStateRequest extends RequestBase<QueryStateResponse> {
    public String[] To_Account;

    @Override
    public Class getResponseClass() {
        return QueryStateResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/openim/querystate";
    }
}
