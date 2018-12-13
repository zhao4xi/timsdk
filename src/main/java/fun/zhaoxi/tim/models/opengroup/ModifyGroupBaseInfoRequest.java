package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class ModifyGroupBaseInfoRequest  extends RequestBase<ModifyGroupBaseInfoResponse> {
    /**
     * 要修改哪个群的基础资料（必填）
     */
    private String GroupId;
    /**
     * 群名称（选填）
     */
    private String Name;
    /**
     * 群简介（选填）
     */
    private String Introduction;
    /**
     * 群公告（选填）
     */
    private String Notification;
    /**
     * 群头像（选填）
     */
    private String FaceUrl;
    /**
     * 最大群成员数量（选填）
     * 最大 10000
     */
    private Integer MaxMemberNum;
    /**
     * 申请加群方式（选填）
     *  FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群）
     */
    private String ApplyJoinOption;
    /**
     * 设置全员禁言（选填）:"On"开启，"Off"关闭
     */
    private String ShutUpAllMember;

    private AppDefined[] AppDefinedData;

    @Override
    public Class getResponseClass() {
        return ModifyGroupBaseInfoResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/modify_group_base_info";
    }
}
