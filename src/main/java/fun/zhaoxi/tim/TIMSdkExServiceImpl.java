package fun.zhaoxi.tim;


import fun.zhaoxi.tim.models.opengroup.*;
import fun.zhaoxi.tim.models.openlogin.AccountImportRequest;
import fun.zhaoxi.tim.models.openlogin.AccountImportResponse;
import fun.zhaoxi.tim.models.profile.PortraitSetRequest;
import fun.zhaoxi.tim.models.profile.PortraitSetResponse;
import fun.zhaoxi.tim.models.profile.ProfileitemModel;
import fun.zhaoxi.tim.models.sns.*;

public class TIMSdkExServiceImpl implements TIMSdkExService {

    private TIMSdkService timSdkService;

    public TIMSdkExServiceImpl(TIMSdkService timSdkService) {
        this.timSdkService = timSdkService;
    }

    public boolean AccountImport(String identifier, String nickName, String faceUrl) {
        AccountImportRequest request = new AccountImportRequest();
        request.setFaceUrl(faceUrl);
        request.setNick(nickName);
        request.setIdentifier(identifier);
        AccountImportResponse response = timSdkService.AccountImport(request);
        return response.getSuccess();
    }

    public boolean PortraitSet(String identifier, String tagProfileCustomUserId) {
        PortraitSetRequest request = new PortraitSetRequest();
        request.setFrom_Account(identifier);
        ProfileitemModel model = new ProfileitemModel();
        model.setTag("Tag_Profile_Custom_UserId");
        model.setValue(tagProfileCustomUserId);
        request.setProfileItem(new ProfileitemModel[]{model});
        PortraitSetResponse response = timSdkService.PortraitSet(request);
        return response.getSuccess();
    }

    public boolean FriendAdd(String identifier, String friendIdentifier, String friendRemark) {
        FriendAddRequest request = new FriendAddRequest();
        request.setFrom_Account(identifier);
        request.setForceAddFlags(1);
        request.setAddType("Add_Type_Single");
        AddFriendItemModel model = new AddFriendItemModel();
        model.setAddSource("AddSource_Type_Admin");
        model.setTo_Account(friendIdentifier);
        model.setRemark(friendRemark);
        request.setAddFriendItem(new AddFriendItemModel[]{model});
        FriendAddResponse response = timSdkService.FriendAdd(request);
        return response.getSuccess();
    }

    public boolean FriendUpdate(String identifier, String toIdentifier, String tagSNSCustomMsgFlag) {
        FriendUpdateRequest request = new FriendUpdateRequest();
        request.setFrom_Account(identifier);
        UpdateItemModel model = new UpdateItemModel();
        SnsItemModel snsItemModel = new SnsItemModel();
        snsItemModel.setTag("Tag_SNS_Custom_MsgFlag");
        snsItemModel.setValue(tagSNSCustomMsgFlag);
        model.setSnsItem(new SnsItemModel[]{snsItemModel});
        request.setUpdateItem(new UpdateItemModel[]{model});
        FriendUpdateResponse response = timSdkService.FriendUpdate(request);
        return response.getSuccess();
    }

    public boolean GroupCreate(String groupId, String teamName, String faceUrl, String appDataKeyRoomsValue) {
        GroupCreateRequest request = new GroupCreateRequest();
        request.setGroupId(groupId);
        request.setType("Public");
        request.setMaxMemberCount(500);
        request.setName(teamName);
        request.setFaceUrl(faceUrl);
        AppDefined model = new AppDefined();
        model.setKey("Rooms");
        model.setValue(appDataKeyRoomsValue);
        request.setAppDefinedData(new AppDefined[]{model});
        GroupCreateResponse response = timSdkService.GroupCreate(request);
        return response.getSuccess();
    }

    public boolean ModifyGroupBaseInfo(String groupId, String teamName, String faceUrl, String appDataKeyRoomsValue) {
        ModifyGroupBaseInfoRequest request = new ModifyGroupBaseInfoRequest();
        request.setGroupId(groupId);
        request.setName(teamName);
        request.setFaceUrl(faceUrl);
        AppDefined model = new AppDefined();
        model.setKey("Rooms");
        model.setValue(appDataKeyRoomsValue);
        request.setAppDefinedData(new AppDefined[]{model});
        ModifyGroupBaseInfoResponse response = timSdkService.ModifyGroupBaseInfo(request);
        return response.getSuccess();
    }

    public boolean GroupAddMember(String groupId, String memberAccount) {
        GroupAddMemberRequest request = new GroupAddMemberRequest();
        request.setGroupId(groupId);
        MemberListRequestModel model = new MemberListRequestModel();
        model.setMember_Account(memberAccount);
        request.setMemberList(new MemberListRequestModel[]{model});
        GroupAddMemberResponse response = timSdkService.GroupAddMember(request);
        return response.getSuccess();
    }

    public boolean ModifyGroupMemberInfo(String groupId, String memberAccount, String nameCard, String appDataKeyRoomId) {
        ModifyGroupMemberInfoRequest request = new ModifyGroupMemberInfoRequest();
        request.setGroupId(groupId);
        request.setMember_Account(memberAccount);
        request.setNameCard(nameCard);
        AppDefined appDefined = new AppDefined();
        appDefined.setKey("RoomId");
        appDefined.setKey(appDataKeyRoomId);
        request.setAppMemberDefinedData(new AppDefined[]{appDefined});
        ModifyGroupMemberInfoResponse response = timSdkService.ModifyGroupMemberInfo(request);
        return response.getSuccess();
    }

    public boolean GroupSetNotify(String groupId, String memberAccount, int msgFlg) {
        ModifyGroupMemberInfoRequest request = new ModifyGroupMemberInfoRequest();
        request.setGroupId(groupId);
        request.setMember_Account(memberAccount);
        String msgFlag = msgFlg == 0 ? "AcceptAndNotify" : (msgFlg == 1 ? "Discard" : "AcceptNotNotify");
        request.setMsgFlag(msgFlag);
        ModifyGroupMemberInfoResponse response = timSdkService.ModifyGroupMemberInfo(request);
        return response.getSuccess();
    }

    public boolean FriendSetNotify(String indentifier, String toAcount, int msgFlg) {
        FriendUpdateRequest request = new FriendUpdateRequest();
        request.setFrom_Account(indentifier);
        UpdateItemModel model = new UpdateItemModel();
        model.setTo_Account(toAcount);
        SnsItemModel snsItemModel = new SnsItemModel();
        snsItemModel.setValue(msgFlg == 0 ? "AcceptAndNotify" : (msgFlg == 1 ? "Discard" : "AcceptNotNotify"));
        snsItemModel.setTag("Tag_SNS_Custom_MsgFlag");
        model.setSnsItem(new SnsItemModel[]{snsItemModel});
        FriendUpdateResponse response = timSdkService.FriendUpdate(request);
        return response.getSuccess();
    }
}
