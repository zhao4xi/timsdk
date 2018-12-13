package fun.zhaoxi.tim;

import fun.zhaoxi.tim.models.openconfig.*;
import fun.zhaoxi.tim.models.opengroup.*;
import fun.zhaoxi.tim.models.openim.*;
import fun.zhaoxi.tim.models.openimdirtywords.*;
import fun.zhaoxi.tim.models.openlogin.*;
import fun.zhaoxi.tim.models.openmsg.*;
import fun.zhaoxi.tim.models.profile.*;
import fun.zhaoxi.tim.models.sns.*;


public interface TIMSdkService {

    String generateSig(String userID);

    AccountImportResponse accountImport(AccountImportRequest request);
    AccountMultiImportResponse multiAccountImport(AccountMultiImportRequest request);
    AccountExpiredResponse accountExpired(AccountExpiredRequest request) ;

    SendMsgResponse sendMsg(SendMsgRequest request);
    BatchSendMsgResponse batchSendMsg(BatchSendMsgRequest request);
    ImportMsgResponse importMsg(ImportMsgRequest request);

    GetAppIdGroupListResponse GroupGetListByAppId(GetAppIdGroupListRequest request);
    GroupCreateResponse GroupCreate(GroupCreateRequest request);
    GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest request) ;
    GetGroupMemberInfoResponse GetGroupMemberInfo(GetGroupMemberInfoRequest request);
    ModifyGroupBaseInfoResponse ModifyGroupBaseInfo(ModifyGroupBaseInfoRequest request);
    GroupAddMemberResponse GroupAddMember(GroupAddMemberRequest request);
    GroupDeleteMemberResponse GroupDeleteMember(GroupDeleteMemberRequest request);
    ModifyGroupMemberInfoResponse ModifyGroupMemberInfo(ModifyGroupMemberInfoRequest request);
    GroupDestroyResponse GroupDestroy(GroupDestroyRequest request);
    GetJoinedGroupListResponse GetJoinedGroupList(GetJoinedGroupListRequest request);
    GetRoleInGroupResponse GetRoleInGroup(GetRoleInGroupRequest request);
    ForbidSendMsgResponse ForbidSendMsg(ForbidSendMsgRequest request);
    GetGroupShuttedUinResponse GetGroupShuttedUin(GetGroupShuttedUinRequest request);
    SendGroupMsgResponse SendGroupMsg(SendGroupMsgRequest request);
    SendGroupSystemNotificationResponse SendGroupSystemNotification(SendGroupSystemNotificationRequest request);
    ChangeGroupOwnerResponse ChangeGroupOwner(ChangeGroupOwnerRequest request);
    ImportGroupResponse ImportGroup(ImportGroupRequest request) ;
    ImportGroupMsgResponse ImportGroupMsg(ImportGroupMsgRequest request) ;
    ImportGroupMemberResponse ImportGroupMember(ImportGroupMemberRequest request) ;
    SetUnreadMsgNumResponse SetUnreadMsgNum(SetUnreadMsgNumRequest request) ;
    DeleteGroupMsgBySenderResponse DeleteGroupMsgBySender(DeleteGroupMsgBySenderRequest request) ;
    GroupMsgGetSimpleResponse groupMsgGetSimple(GroupMsgGetSimpleRequest request) ;


    PortraitSetResponse portraitSet(PortraitSetRequest request);
    PortraitGetResponse portraitGet(PortraitGetRequest request);


    FriendAddResponse friendAdd(FriendAddRequest request);
    FriendImportResponse friendImport(FriendImportRequest request);
    FriendDeleteResponse friendDelete(FriendDeleteRequest request);
    FriendDeleteAllResponse friendDeleteAll(FriendDeleteAllRequest request);
    FriendCheckResponse friendCheck(FriendCheckRequest request);
    FriendGetAllResponse friendGetAll(FriendGetAllRequest request);
    FriendGetListResponse friendGetList(FriendGetListRequest request);
    BlackListAddResponse blackListAdd(BlackListAddRequest request);
    BlackListDeleteResponse blackListDelete(BlackListDeleteRequest request);
    BlackListGetResponse blackListGet(BlackListGetRequest request);
    BlackListCheckResponse blackListCheck(BlackListCheckRequest request);
    GroupAddResponse groupAdd(GroupAddRequest request);
    GroupDeleteResponse groupDelete(GroupDeleteRequest request);
    FriendUpdateResponse friendUpdate(FriendUpdateRequest request);


    DirtyWordsGetResponse dirtyWordsGet(DirtyWordsGetRequest request);
    DirtyWordsAddResponse dirtyWordsAdd(DirtyWordsAddRequest request);
    DirtyWordsDeleteResponse dirtyWordsDelete(DirtyWordsDeleteRequest request);


    GetHistoryResponse getHistory(GetHistoryRequest request);

    QueryStateResponse queryState(QueryStateRequest request);

    SetNoSpeakingResponse setNoSpeaking(SetNoSpeakingRequest request);
    GetNoSpeakingResponse getNoSpeaking(GetNoSpeakingRequest request);

}
