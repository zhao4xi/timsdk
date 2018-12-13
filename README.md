腾讯tim sdk for Java
===

### 如何使用
见fun.zhaoxi.tim.TIMBooter文件
```
   public class TIMBooter {
   
       static String BASE_URL = "https://console.tim.qq.com/";
       static String IDENTIFIER = "your identifier";
       static Long SDK_APPID = 1L;// your sdk appid
       static String USER_SIGN = "your sign";
   
       public static void main(String[] args) {
   
           TIMSdkConfig config = new TIMSdkConfig();
           config.setBaseUrl(BASE_URL);
           config.setIdentifier(IDENTIFIER);
           config.setSdkAppId(SDK_APPID);
           config.setUserSign(USER_SIGN);
   
           TIMSdkService timSdkService = new TIMSdkServiceImpl(config);
           GetGroupInfoRequest request = new GetGroupInfoRequest();
           request.setGroupIdList(new String[]{"686b82cd67204ae6b2dbaf2dde96c40f"});
           request.setResponseFilter(null);
           GetGroupInfoResponse response = timSdkService.GetGroupInfo(request);
   
       }
   }
```

###方法介绍

所有的方法都通过TimSdkService进行调用

#####生成Sign
1. 生成用户Sign<br/>
`String generateSig(String userID)`

#####账号管理
1. 独立模式帐号导入  v4/im_open_login_svc/account_import<br/>
`AccountImportResponse accountImport(AccountImportRequest request);`<br/>
2. 独立模式帐号批量导入 v4/im_open_login_svc/multiaccount_import<br/>
`AccountMultiImportResponse multiAccountImport(AccountMultiImportRequest request);`<br/>
3. 失效帐号登录态 v4/im_open_login_svc/kick<br/>
`AccountExpiredResponse accountExpired(AccountExpiredRequest request);`
4. 托管模式帐号导入<br/>
`接口作废`


#####单聊消息
1. 单发单聊消息<br/>
`AccountImportResponse accountImport(AccountImportRequest request);`<br/>
2. 批量发单聊消息<br/>
`AccountMultiImportResponse multiAccountImport(AccountMultiImportRequest request);`<br/>
3. 导入单聊消息<br/>
`AccountExpiredResponse accountExpired(AccountExpiredRequest request);`

 
#####群组管理
1. 获取APP中的所有群组	v4/group_open_http_svc/get_appid_group_list    <br/>
`GetAppIdGroupListResponse GroupGetListByAppId(GetAppIdGroupListRequest request);`                            
2. 创建群组	v4/group_open_http_svc/create_group <br/>
`GroupCreateResponse GroupCreate(GroupCreateRequest request);` 
3. 获取群组详细资料	v4/group_open_http_svc/get_group_info  <br/>
`GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest request) ;` 
4. 获取群成员详细资料	v4/group_open_http_svc/get_group_member_info  <br/>
`GetGroupMemberInfoResponse GetGroupMemberInfo(GetGroupMemberInfoRequest request);`
5. 修改群组基础资料	v4/group_open_http_svc/modify_group_base_info <br/>
`ModifyGroupBaseInfoResponse ModifyGroupBaseInfo(ModifyGroupBaseInfoRequest request);`  
6. 增加群组成员	v4/group_open_http_svc/add_group_member   <br/>
`GroupAddMemberResponse GroupAddMember(GroupAddMemberRequest request);`
7. 删除群组成员	v4/group_open_http_svc/delete_group_member   <br/>
`GroupDeleteMemberResponse GroupDeleteMember(GroupDeleteMemberRequest request);`
8. 修改群组成员资料	v4/group_open_http_svc/modify_group_member_info   <br/>
`ModifyGroupMemberInfoResponse ModifyGroupMemberInfo(ModifyGroupMemberInfoRequest request);`
9. 解散群组	v4/group_open_http_svc/destroy_group  <br/>
`GroupDestroyResponse GroupDestroy(GroupDestroyRequest request);`
10. 获取用户所加入的群组	v4/group_open_http_svc/get_joined_group_list   <br/>
`GetJoinedGroupListResponse GetJoinedGroupList(GetJoinedGroupListRequest request);`
11. 查询用户在群组中的身份	v4/group_open_http_svc/get_role_in_group   <br/>
`GetRoleInGroupResponse GetRoleInGroup(GetRoleInGroupRequest request);`
12. 批量禁言和取消禁言	v4/group_open_http_svc/forbid_send_msg   <br/>
`ForbidSendMsgResponse ForbidSendMsg(ForbidSendMsgRequest request);`
13. 获取群组被禁言用户列表	v4/group_open_http_svc/get_group_shutted_uin   <br/>
`GetGroupShuttedUinResponse GetGroupShuttedUin(GetGroupShuttedUinRequest request);`
14. 在群组中发送普通消息	v4/group_open_http_svc/send_group_msg   <br/>
`SendGroupMsgResponse SendGroupMsg(SendGroupMsgRequest request);`
15. 在群组中发送系统通知	v4/group_open_http_svc/send_group_system_notification   <br/>
`SendGroupSystemNotificationResponse SendGroupSystemNotification(SendGroupSystemNotificationRequest request);`
16. 转让群组	v4/group_open_http_svc/change_group_owner   <br/>
`ChangeGroupOwnerResponse ChangeGroupOwner(ChangeGroupOwnerRequest request);`
17. 导入群基础资料	v4/group_open_http_svc/import_group   <br/>
`ImportGroupResponse ImportGroup(ImportGroupRequest request) ;`
18. 导入群消息	v4/group_open_http_svc/import_group_msg   <br/>
`ImportGroupMsgResponse ImportGroupMsg(ImportGroupMsgRequest request) ;`
19. 导入群成员	v4/group_open_http_svc/import_group_member   <br/>
`ImportGroupMemberResponse ImportGroupMember(ImportGroupMemberRequest request) ;`
20. 设置成员未读消息计数	v4/group_open_http_svc/set_unread_msg_num   <br/>
`SetUnreadMsgNumResponse SetUnreadMsgNum(SetUnreadMsgNumRequest request) ;`
21. 删除指定用户发送的消息	v4/group_open_http_svc/delete_group_msg_by_sender<br/>
`DeleteGroupMsgBySenderResponse DeleteGroupMsgBySender(DeleteGroupMsgBySenderRequest request) ;`   
22. 拉取群漫游消息	v4/group_open_http_svc/group_msg_get_simple   <br/>
`GroupMsgGetSimpleResponse groupMsgGetSimple(GroupMsgGetSimpleRequest request) ;`

#####资料管理
1. 拉取资料 v4/profile/portrait_get<br/>
`PortraitSetResponse portraitSet(PortraitSetRequest request);`
2. 设置资料 v4/profile/portrait_set<br/>	
`PortraitGetResponse portraitGet(PortraitGetRequest request);`

#####关系链管理
1. 添加好友	v4/sns/friend_add <br/>
`FriendAddResponse friendAdd(FriendAddRequest request);`
2. 导入好友	v4/sns/friend_import<br/>
`FriendImportResponse friendImport(FriendImportRequest request);`
3. 删除好友	v4/sns/friend_delete<br/>
`FriendDeleteResponse friendDelete(FriendDeleteRequest request);`
4. 删除所有好友	v4/sns/friend_delete_all <br/>
`FriendDeleteAllResponse friendDeleteAll(FriendDeleteAllRequest request);`
5. 校验好友	v4/sns/friend_check<br/>
`FriendCheckResponse friendCheck(FriendCheckRequest request);`
6. 拉取好友	v4/sns/friend_get_all<br/>
`FriendGetAllResponse friendGetAll(FriendGetAllRequest request);`
7. 拉取指定好友	v4/sns/friend_get_list<br/>
`FriendGetListResponse friendGetList(FriendGetListRequest request);`
8. 添加黑名单	v4/sns/black_list_add<br/>
`BlackListAddResponse blackListAdd(BlackListAddRequest request);`
9. 删除黑名单	v4/sns/black_list_delete<br/>
`BlackListDeleteResponse blackListDelete(BlackListDeleteRequest request);`
10. 拉取黑名单	v4/sns/black_list_get<br/>
`BlackListGetResponse blackListGet(BlackListGetRequest request);`
11. 校验黑名单	v4/sns/black_list_check<br/>
`BlackListCheckResponse blackListCheck(BlackListCheckRequest request);`
12. 添加分组	v4/sns/group_add<br/>
`GroupAddResponse groupAdd(GroupAddRequest request);`
13. 删除分组	v4/sns/group_delete<br/>
`GroupAddResponse groupAdd(GroupAddRequest request);`
14. 更新好友	v4/sns/friend_update<br/>
`FriendUpdateResponse friendUpdate(FriendUpdateRequest request);`

#####脏字管理
1. 查询脏字	v4/openim_dirty_words/get<br/>
`DirtyWordsGetResponse dirtyWordsGet(DirtyWordsGetRequest request);`
2. 添加脏字	v4/openim_dirty_words/add<br/>
`DirtyWordsAddResponse dirtyWordsAdd(DirtyWordsAddRequest request);`
3. 删除脏字	v4/openim_dirty_words/delete<br/>
`DirtyWordsDeleteResponse dirtyWordsDelete(DirtyWordsDeleteRequest request);`


#####数据下载
1. 消息记录下载	v4/open_msg_svc/get_history<br/>
`GetHistoryResponse getHistory(GetHistoryRequest request);`

#####在线状态
1. 获取用户在线状态	v4/openim/querystate<br/>
`QueryStateResponse queryState(QueryStateRequest request);`

#####全局禁言管理
1. 设置全局禁言	v4/openconfigsvr/setnospeaking<br/>
`SetNoSpeakingResponse setNoSpeaking(SetNoSpeakingRequest request);`
2. 查询全局禁言	v4/openconfigsvr/getnospeaking<br/>
`GetNoSpeakingResponse getNoSpeaking(GetNoSpeakingRequest request);`

####未实现接口:

#####消息推送
1. 推送	v4/openim/im_push<br />
2. 获取推送报告	v4/openim/im_get_push_report<br />
3. 设置应用属性名称	v4/openim/im_set_attr_name<br />
4. 获取应用属性名称	v4/openim/im_get_attr_name<br />
5. 设置用户属性	v4/openim/im_set_attr   <br />
6. 删除用户属性	v4/openim/im_remove_attr<br />
7. 获取用户属性	v4/openim/im_get_attr<br />
8. 添加用户标签	v4/openim/im_add_tag<br />
9. 删除用户标签	v4/openim/im_remove_tag<br />
10. 删除用户所有标签 v4/openim/im_remove_tag_all<br />


#####消息推送回调
计划1.1 版本提交