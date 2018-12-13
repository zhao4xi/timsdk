package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class GroupCreateRequest extends RequestBase<GroupCreateResponse> {
    private String Owner_Account;
    private String Type;
    private String Name;
    private String GroupId;
    private String Introduction;
    private String Notification;
    private String FaceUrl;
    private Integer MaxMemberCount;
    private String ApplyJoinOption;
    private AppDefined[] AppDefinedData;
    private MemberListModel[] MemberList;

    @Override
    public Class getResponseClass() {
        return GroupCreateResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/create_group";
    }
}
