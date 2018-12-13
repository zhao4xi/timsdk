package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
public class ImportGroupRequest extends RequestBase<ImportGroupResponse> {

    private String Owner_Account;

    private String Type;

    private String GroupId;

    private String Name;

    private String Introduction;

    private String Notification;

    private String FaceUrl;

    private int MaxMemberCount;

    private String ApplyJoinOption;

    private int CreateTime;

    private List<AppDefined> AppDefinedData ;

    @Override
    public Class getResponseClass() {
        return ImportGroupResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/import_group";
    }
}
