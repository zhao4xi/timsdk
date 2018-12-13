package fun.zhaoxi.tim;

import com.tls.tls_sigature.tls_sigature;
import fun.zhaoxi.tim.models.openconfig.*;
import fun.zhaoxi.tim.models.opengroup.*;
import fun.zhaoxi.tim.models.openim.*;
import fun.zhaoxi.tim.models.openimdirtywords.*;
import fun.zhaoxi.tim.models.openlogin.*;
import fun.zhaoxi.tim.models.openmsg.*;
import fun.zhaoxi.tim.models.profile.*;
import fun.zhaoxi.tim.models.sns.*;

public class TIMSdkServiceImpl implements TIMSdkService {

    private TIMSdkConfig sdkConfig;
    private DefaultTIMClient timClient;

    public TIMSdkServiceImpl(TIMSdkConfig sdkConfig) {
        this.sdkConfig = sdkConfig;
        timClient = new DefaultTIMClient(sdkConfig);
    }

    public String generateSig(String identifier) {
        tls_sigature.GenTLSSignatureResult sign = tls_sigature.GenTLSSignatureEx(sdkConfig.getSdkAppId(), identifier, sdkConfig.getPrivateKey());
        if (sign.errMessage == null || sign.errMessage.equals(""))
            return sign.urlSig;
        throw new TIMSdkException("签名错误, AppId:" + sdkConfig.getSdkAppId() + " userId:" + identifier);
    }

    public GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest request) {
        return timClient.execute(request);
    }

    public GetGroupMemberInfoResponse GetGroupMemberInfo(GetGroupMemberInfoRequest request) {
        return timClient.execute(request);
    }


    public BatchSendMsgResponse batchSendMsg(BatchSendMsgRequest request) {
        return timClient.execute(request);
    }

    public ImportMsgResponse importMsg(ImportMsgRequest request) {
        return timClient.execute(request);
    }

    public SendMsgResponse sendMsg(SendMsgRequest request) {
        return timClient.execute(request);
    }

    public AccountImportResponse accountImport(AccountImportRequest request) {
        return timClient.execute(request);
    }

    public PortraitSetResponse portraitSet(PortraitSetRequest request) {
        return timClient.execute(request);
    }

    public PortraitGetResponse portraitGet(PortraitGetRequest request) {
        return timClient.execute(request);
    }

    public FriendUpdateResponse friendUpdate(FriendUpdateRequest request) {
        return timClient.execute(request);
    }

    public FriendDeleteResponse friendDelete(FriendDeleteRequest request) {
        return timClient.execute(request);
    }

    public ModifyGroupBaseInfoResponse ModifyGroupBaseInfo(ModifyGroupBaseInfoRequest request) {
        return timClient.execute(request);

    }

    public AccountMultiImportResponse multiAccountImport(AccountMultiImportRequest request) {
        return timClient.execute(request);
    }

    public AccountExpiredResponse accountExpired(AccountExpiredRequest request) {
        return timClient.execute(request);
    }

    public GetAppIdGroupListResponse GroupGetListByAppId(GetAppIdGroupListRequest request) {
        return timClient.execute(request);
    }

    public GroupCreateResponse GroupCreate(GroupCreateRequest request) {
        return timClient.execute(request);
    }

    public GroupDestroyResponse GroupDestroy(GroupDestroyRequest request) {
        return timClient.execute(request);
    }


    public GetJoinedGroupListResponse GetJoinedGroupList(GetJoinedGroupListRequest request) {
        return timClient.execute(request);
    }

    public GetRoleInGroupResponse GetRoleInGroup(GetRoleInGroupRequest request) {
        return timClient.execute(request);
    }

    public ForbidSendMsgResponse ForbidSendMsg(ForbidSendMsgRequest request) {
        return timClient.execute(request);
    }

    public GetGroupShuttedUinResponse GetGroupShuttedUin(GetGroupShuttedUinRequest request) {
        return timClient.execute(request);
    }

    public GroupAddMemberResponse GroupAddMember(GroupAddMemberRequest request) {
        return timClient.execute(request);
    }

    public FriendAddResponse friendAdd(FriendAddRequest request) {
        return timClient.execute(request);
    }

    public FriendImportResponse friendImport(FriendImportRequest request) {
        return timClient.execute(request);
    }

    public FriendDeleteAllResponse friendDeleteAll(FriendDeleteAllRequest request) {
        return timClient.execute(request);
    }

    public FriendCheckResponse friendCheck(FriendCheckRequest request) {
        return timClient.execute(request);
    }

    public FriendGetAllResponse friendGetAll(FriendGetAllRequest request) {
        return timClient.execute(request);
    }

    public FriendGetListResponse friendGetList(FriendGetListRequest request) {
        return timClient.execute(request);
    }

    public BlackListAddResponse blackListAdd(BlackListAddRequest request) {
        return timClient.execute(request);
    }

    public BlackListDeleteResponse blackListDelete(BlackListDeleteRequest request) {
        return timClient.execute(request);
    }

    public BlackListGetResponse blackListGet(BlackListGetRequest request) {
        return timClient.execute(request);
    }

    public BlackListCheckResponse blackListCheck(BlackListCheckRequest request) {
        return timClient.execute(request);
    }

    public GroupAddResponse groupAdd(GroupAddRequest request) {
        return timClient.execute(request);
    }

    public GroupDeleteResponse groupDelete(GroupDeleteRequest request) {
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

    public ChangeGroupOwnerResponse ChangeGroupOwner(ChangeGroupOwnerRequest request) {
        return timClient.execute(request);
    }

    public ImportGroupResponse ImportGroup(ImportGroupRequest request) {
        return timClient.execute(request);
    }

    public ImportGroupMsgResponse ImportGroupMsg(ImportGroupMsgRequest request) {
        return timClient.execute(request);
    }

    public ImportGroupMemberResponse ImportGroupMember(ImportGroupMemberRequest request) {
        return timClient.execute(request);
    }

    public SetUnreadMsgNumResponse SetUnreadMsgNum(SetUnreadMsgNumRequest request) {
        return timClient.execute(request);
    }

    public DeleteGroupMsgBySenderResponse DeleteGroupMsgBySender(DeleteGroupMsgBySenderRequest request) {
        return timClient.execute(request);
    }

    public GroupMsgGetSimpleResponse groupMsgGetSimple(GroupMsgGetSimpleRequest request) {
        return timClient.execute(request);
    }


    public SendGroupMsgResponse SendGroupMsg(SendGroupMsgRequest request) {
        return timClient.execute(request);
    }


    public DirtyWordsGetResponse dirtyWordsGet(DirtyWordsGetRequest request) {
        return timClient.execute(request);
    }

    public DirtyWordsAddResponse dirtyWordsAdd(DirtyWordsAddRequest request) {
        return timClient.execute(request);
    }

    public DirtyWordsDeleteResponse dirtyWordsDelete(DirtyWordsDeleteRequest request) {
        return timClient.execute(request);
    }

    public GetHistoryResponse getHistory(GetHistoryRequest request) {
        return timClient.execute(request);
    }

    public QueryStateResponse queryState(QueryStateRequest request) {
        return timClient.execute(request);
    }

    public SetNoSpeakingResponse setNoSpeaking(SetNoSpeakingRequest request) {
        return timClient.execute(request);
    }

    public GetNoSpeakingResponse getNoSpeaking(GetNoSpeakingRequest request) {
        return timClient.execute(request);
    }
}
