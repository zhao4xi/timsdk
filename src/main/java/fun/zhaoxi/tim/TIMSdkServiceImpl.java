package fun.zhaoxi.tim;

import com.tls.tls_sigature.tls_sigature;
import fun.zhaoxi.tim.models.opengroup.*;
import fun.zhaoxi.tim.models.openim.BatchSendMsgRequest;
import fun.zhaoxi.tim.models.openim.BatchSendMsgResponse;
import fun.zhaoxi.tim.models.openim.SendMsgRequest;
import fun.zhaoxi.tim.models.openim.SendMsgResponse;
import fun.zhaoxi.tim.models.openlogin.*;
import fun.zhaoxi.tim.models.profile.PortraitSetRequest;
import fun.zhaoxi.tim.models.profile.PortraitSetResponse;
import fun.zhaoxi.tim.models.sns.*;

public class TIMSdkServiceImpl implements TIMSdkService {

    private TIMSdkConfig sdkConfig;
    private DefaultTIMClient timClient;

    public TIMSdkServiceImpl(TIMSdkConfig sdkConfig) {
        this.sdkConfig = sdkConfig;
        timClient = new DefaultTIMClient(sdkConfig);
    }

    public String GenerateSig(String userID) {
        tls_sigature.GenTLSSignatureResult sign = tls_sigature.GenTLSSignatureEx(sdkConfig.getSdkAppId(), userID, sdkConfig.getPrivateKey());
        if (sign.errMessage == null || sign.errMessage.equals(""))
            return sign.urlSig;
        throw new TIMSdkException("签名错误, AppId:" + sdkConfig.getSdkAppId() + " userId:" + userID);
    }

    public GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest request) {
        return timClient.execute(request);
    }

    public ImportGroupMemberResponse ImportGroupMember(ImportGroupMemberRequest request) {
        return timClient.execute(request);
    }

    public BatchSendMsgResponse BatchSendMsg(BatchSendMsgRequest request) {
        return timClient.execute(request);

    }

    public SendMsgResponse SendMsg(SendMsgRequest request) {
        return timClient.execute(request);
    }

    public AccountImportResponse AccountImport(AccountImportRequest request) {
        return timClient.execute(request);
    }

    public PortraitSetResponse PortraitSet(PortraitSetRequest request) {
        return timClient.execute(request);
    }

    public FriendUpdateResponse FriendUpdate(FriendUpdateRequest request) {
        return timClient.execute(request);
    }

    public FriendDeleteResponse FriendDelete(FriendDeleteRequest request) {
        return timClient.execute(request);
    }

    public ModifyGroupBaseInfoResponse ModifyGroupBaseInfo(ModifyGroupBaseInfoRequest request) {
        return timClient.execute(request);

    }

    public AccountMultiImportResponse MultiAccountImport(AccountMultiImportRequest request) {
        return timClient.execute(request);
    }

    public AccountExpiredResponse AccountExpired(AccountExpiredRequest request) {
        return timClient.execute(request);
    }

    public GroupCreateResponse GroupCreate(GroupCreateRequest request) {
        return timClient.execute(request);
    }

    public GroupDestroyResponse GroupDestroy(GroupDestroyRequest request) {
        return timClient.execute(request);
    }

    public GroupAddMemberResponse GrouAddMember(GroupAddMemberRequest request) {
        return timClient.execute(request);
    }

    public FriendAddResponse FriendAdd(FriendAddRequest request) {
        return timClient.execute(request);
    }

    public GroupAddMemberResponse GroupAddMember(GroupAddMemberRequest request) {
        return timClient.execute(request);
    }

    public ModifyGroupMemberInfoResponse ModifyGroupMemberInfo(ModifyGroupMemberInfoRequest request) {
        return timClient.execute(request);
    }

    public GroupDeleteMemberResponse GroupDeleteMember(GroupDeleteMemberRequest request) {
        return timClient.execute(request);
    }

    public SendGroupSystemNotificationResponse SendGroupSystemNotification(SendGroupSystemNotificationRequest request) {
        return timClient.execute(request);
    }

    public SendGroupMsgResponse SendGroupMsg(SendGroupMsgRequest request) {
        return timClient.execute(request);
    }
}
