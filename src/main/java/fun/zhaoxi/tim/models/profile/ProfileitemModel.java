package fun.zhaoxi.tim.models.profile;

import lombok.Data;


@Data
public class ProfileitemModel {

    public static String Tag_Profile_IM_Nick = "Tag_Profile_IM_Nick";
    public static String Tag_Profile_IM_Gender = "Tag_Profile_IM_Gender";
    public static String Tag_Profile_IM_BirthDay = "Tag_Profile_IM_BirthDay";
    public static String Tag_Profile_IM_Location = "Tag_Profile_IM_Location";
    public static String Tag_Profile_IM_SelfSignature = "Tag_Profile_IM_SelfSignature";
    public static String Tag_Profile_IM_AllowType = "Tag_Profile_IM_AllowType";
    public static String Tag_Profile_IM_Language = "Tag_Profile_IM_Nick";
    public static String Tag_Profile_IM_Image = "Tag_Profile_IM_Image";
    public static String Tag_Profile_IM_MsgSettings = "Tag_Profile_IM_MsgSettings";
    public static String Tag_Profile_IM_AdminForbidType = "Tag_Profile_IM_AdminForbidType";
    public static String Tag_Profile_IM_Level = "Tag_Profile_IM_Level";
    public static String Tag_Profile_IM_Role = "Tag_Profile_IM_Role";
    public static String Tag_Profile_Custom_UserId = "Tag_Profile_Custom_UserId";

    /// <summary>
    /// Tag_Profile_IM_Nick : 昵称
    /// Tag_Profile_IM_Gender : Gender_Type_Unknown,Gender_Type_Female,Gender_Type_Male
    /// Tag_Profile_IM_BirthDay : 生日 int32
    /// Tag_Profile_IM_Location : 所在地
    /// Tag_Profile_IM_SelfSignature : 个性签名
    /// Tag_Profile_IM_AllowType : AllowType_Type_NeedConfirm：需要经过自己确认才能添加自己为好友；AllowType_Type_AllowAny：允许任何人添加自己为好友；AllowType_Type_DenyAny：不允许任何人添加自己为好友。
    /// Tag_Profile_IM_Language : 语言 int32
    /// Tag_Profile_IM_Image : 头像URL
    /// Tag_Profile_IM_MsgSettings : 0 表示接收消息，  1 则不接收消息。
    /// Tag_Profile_IM_AdminForbidType : AdminForbid_Type_None：默认值，允许加好友；AdminForbid_Type_SendOut：禁止该用户发起加好友请求。
    /// Tag_Profile_IM_Level : 等级 uint32
    /// Tag_Profile_IM_Role : 角色 uint32
    /// Tag_Profile_Custom_UserId : 用户编号
    /// </summary>
    private String Tag;

    /// <summary>
    /// 值
    /// </summary>
    private String Value;
}
