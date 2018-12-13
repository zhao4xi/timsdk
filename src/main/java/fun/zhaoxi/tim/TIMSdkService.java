package fun.zhaoxi.tim;

import fun.zhaoxi.tim.models.opengroup.*;
import fun.zhaoxi.tim.models.openim.*;
import fun.zhaoxi.tim.models.openlogin.*;
import fun.zhaoxi.tim.models.profile.*;
import fun.zhaoxi.tim.models.sns.*;

import java.io.IOException;

public interface TIMSdkService {

    String GenerateSig(String userID);

    GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest request) ;

    ImportGroupMemberResponse ImportGroupMember(ImportGroupMemberRequest request) ;

    BatchSendMsgResponse BatchSendMsg(BatchSendMsgRequest request);

    SendMsgResponse SendMsg(SendMsgRequest request) throws IOException;

    AccountImportResponse AccountImport(AccountImportRequest request);

    PortraitSetResponse PortraitSet(PortraitSetRequest request);

    FriendUpdateResponse FriendUpdate(FriendUpdateRequest request);

    FriendDeleteResponse FriendDelete(FriendDeleteRequest request);

    ModifyGroupBaseInfoResponse ModifyGroupBaseInfo(ModifyGroupBaseInfoRequest request);

    AccountMultiImportResponse MultiAccountImport(AccountMultiImportRequest request);

    AccountExpiredResponse AccountExpired(AccountExpiredRequest request) ;

    GroupCreateResponse GroupCreate(GroupCreateRequest request);

    GroupDestroyResponse GroupDestroy(GroupDestroyRequest request);

    GroupAddMemberResponse GrouAddMember(GroupAddMemberRequest request);

    FriendAddResponse FriendAdd(FriendAddRequest request);

    GroupAddMemberResponse GroupAddMember(GroupAddMemberRequest request);

    ModifyGroupMemberInfoResponse ModifyGroupMemberInfo(ModifyGroupMemberInfoRequest request);

    GroupDeleteMemberResponse GroupDeleteMember(GroupDeleteMemberRequest request);

    SendGroupSystemNotificationResponse SendGroupSystemNotification(SendGroupSystemNotificationRequest request);

    SendGroupMsgResponse SendGroupMsg(SendGroupMsgRequest request);
}
