package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class GroupJoinedFilter {
    //"GroupBaseInfoFilter": [  // 需要哪些基础信息字段，含义参见“基本字段介绍”
    //        "Type",
    //        "Name",
    //        "Introduction",
    //        "Notification",
    //        "FaceUrl",
    //        "CreateTime",
    //        "Owner_Account",
    //        "LastInfoTime",
    //        "LastMsgTime",
    //        "NextMsgSeq",
    //        "MemberNum",
    //        "MaxMemberNum",
    //        "ApplyJoinOption",
    //        "ShutUpAllMember"
    //    ],
    //    "SelfInfoFilter": [  // 自身在群内的信息
    //        "Role",   // 群内身份
    //        "JoinTime",  // 入群时间
    //        "MsgFlag",   // 消息屏蔽类型
    //        "UnreadMsgNum"  // 未读消息数量（IM云后台计算得出）
    //    ]
    private String[] GroupBaseInfoFilter;
    private String[] SelfInfoFilter;
}
