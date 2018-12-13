package fun.zhaoxi.tim;

/**
 * TIMSdk优化版本
 */
public interface TIMSdkExService {

    /**
     * 导入用户
     *
     * @param identifier 用户编号
     * @return 是否成功
     */
    boolean AccountImport(String identifier, String nickName, String faceUrl);

    /**
     * 修改用户信息
     *
     * @param identifier             用户编号
     * @param tagProfileCustomUserId 自定义字段
     * @return 是否成功
     */
    boolean PortraitSet(String identifier, String tagProfileCustomUserId);

    /**
     * 添加用户好友
     *
     * @param identifier       用户编号
     * @param friendIdentifier 好友编号
     * @param friendRemark     好友备注
     * @return 是否成功
     */
    boolean FriendAdd(String identifier, String friendIdentifier, String friendRemark);

    /**
     * 修改用户信息
     *
     * @param identifier          用户编号
     * @param toIdentifier        好友编号
     * @param tagSNSCustomMsgFlag 自定义字段
     * @return 是否成功
     */
    boolean FriendUpdate(String identifier, String toIdentifier, String tagSNSCustomMsgFlag);

    /**
     * 新建群组
     *
     * @param groupId              群组编号
     * @param teamName             群组名称
     * @param faceUrl              头像
     * @param appDataKeyRoomsValue 自定义Key
     * @return 是否成功
     */
    boolean GroupCreate(String groupId, String teamName, String faceUrl, String appDataKeyRoomsValue);

    /**
     * 修改群组
     *
     * @param groupId         群组编号
     * @param teamName        群组名称
     * @param faceUrl         头像
     * @param appDataKeyRoomsValue 自定义Room Value
     * @return 是否成功
     */
    boolean ModifyGroupBaseInfo(String groupId, String teamName, String faceUrl, String appDataKeyRoomsValue);

    /**
     * 新增群组成员
     *
     * @param groupId       群组编号
     * @param memberAccount 用户编号
     * @return 是否成功
     */
    boolean GroupAddMember(String groupId, String memberAccount);

    /**
     * 修改群组信息
     *
     * @param groupId          群组编号
     * @param memberAccount    用户编号
     * @param nameCard         用户昵称
     * @param appDataKeyRoomId 自定义RoomId的值
     * @return 是否成功
     */
    boolean ModifyGroupMemberInfo(String groupId, String memberAccount, String nameCard, String appDataKeyRoomId);

    /**
     * 群组设置通知
     *
     * @param groupId       群组编号
     * @param memberAccount 成员编号
     * @param msgFlg        0: 通知 1: 禁止 2: 接受不通知
     * @return 是否成功
     */
    boolean GroupSetNotify(String groupId, String memberAccount, int msgFlg);

    /**
     * 好友设置通知
     *
     * @param indentifier 群组编号
     * @param toAcount    成员编号
     * @param msgFlg      0: 通知 1: 禁止 2: 接受不通知
     * @return 是否成功
     */
    boolean FriendSetNotify(String indentifier, String toAcount, int msgFlg);
}
