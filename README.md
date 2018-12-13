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

#####账号管理
1. 独立模式帐号导入<br/>
`AccountImportResponse AccountImport(AccountImportRequest request);`<br/>
2. 独立模式帐号批量导入<br/>
`AccountMultiImportResponse MultiAccountImport(AccountMultiImportRequest request);`<br/>
3. 失效帐号登录态<br/>
`AccountExpiredResponse AccountExpired(AccountExpiredRequest request);`
4. 托管模式帐号导入<br/>
`接口作废`


#####单聊消息
1. 单发单聊消息<br/>
`AccountImportResponse AccountImport(AccountImportRequest request);`<br/>
2. 批量发单聊消息<br/>
`AccountMultiImportResponse MultiAccountImport(AccountMultiImportRequest request);`<br/>
3. 导入单聊消息<br/>
`AccountExpiredResponse AccountExpired(AccountExpiredRequest request);`


#####消息推送
1. 推送<br />	v4/openim/im_push
2.获取推送报告<br />	v4/openim/im_get_push_report
3.设置应用属性名称<br />	v4/openim/im_set_attr_name
4.获取应用属性名称<br />	v4/openim/im_get_attr_name
5.设置用户属性<br />	v4/openim/im_set_attr
6.删除用户属性<br />	v4/openim/im_remove_attr
7.获取用户属性<br />	v4/openim/im_get_attr
8.添加用户标签<br />	v4/openim/im_add_tag
9.删除用户标签<br />	v4/openim/im_remove_tag
10. 删除用户所有标签<br />

#####群组管理
1. 获取APP中的所有群组	v4/group_open_http_svc/get_appid_group_list
2. 创建群组	v4/group_open_http_svc/create_group
3. 获取群组详细资料	v4/group_open_http_svc/get_group_info
4. 获取群成员详细资料	v4/group_open_http_svc/get_group_member_info
5. 修改群组基础资料	v4/group_open_http_svc/modify_group_base_info
6. 增加群组成员	v4/group_open_http_svc/add_group_member
7. 删除群组成员	v4/group_open_http_svc/delete_group_member
8. 修改群组成员资料	v4/group_open_http_svc/modify_group_member_info
9. 解散群组	v4/group_open_http_svc/destroy_group
10. 获取用户所加入的群组	v4/group_open_http_svc/get_joined_group_list
11. 查询用户在群组中的身份	v4/group_open_http_svc/get_role_in_group
12. 批量禁言和取消禁言	v4/group_open_http_svc/forbid_send_msg
13. 获取群组被禁言用户列表	v4/group_open_http_svc/get_group_shutted_uin
14. 在群组中发送普通消息	v4/group_open_http_svc/send_group_msg
15. 在群组中发送系统通知	v4/group_open_http_svc/send_group_system_notification
16. 转让群组	v4/group_open_http_svc/change_group_owner
17. 导入群基础资料	v4/group_open_http_svc/import_group
18. 导入群消息	v4/group_open_http_svc/import_group_msg
19. 导入群成员	v4/group_open_http_svc/import_group_member
20. 设置成员未读消息计数	v4/group_open_http_svc/set_unread_msg_num
21. 删除指定用户发送的消息	v4/group_open_http_svc/delete_group_msg_by_sender
22. 拉取群漫游消息	v4/group_open_http_svc/group_msg_get_simple

#####资料管理
1. 拉取资料<br/>	v4/profile/portrait_get
2. 设置资料<br/>	v4/profile/portrait_set