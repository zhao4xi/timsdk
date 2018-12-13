package fun.zhaoxi.tim.models.openim;

import fun.zhaoxi.tim.models.msgelem.MsgElementBase;
import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 发送消息请求
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class SendMsgRequest extends RequestBase<SendMsgResponse> {

    /**
     * 消息同步至发送方
     * 1: 同步 2 不同步
     */
    private Integer SyncOtherMachine;
    /**
     * 消息发送方帐号。（用于指定发送消息方帐号）
     */
    private String From_Account;
    /**
     * 消息接收方帐号
     */
    private String To_Account;
    /**
     * 消息离线保存时长（秒数），最长为 7 天（604800s）。若消息只发在线用户，不想保存离线，则该字段填 0。若不填，则默认保存 7 天
     */
    private Integer MsgLifeTime;
    /**
     * 消息随机数,由随机函数产生。（用作消息去重）
     */
    private int MsgRandom;
    /**
     *  消息时间戳，unix 时间戳。
     */
    private int MsgTimeStamp;
    /**
     * 消息内容，具体格式请参考 消息格式描述。（注意，一条消息可包括多种消息元素，MsgBody 为 Array 类型）
     */
    private MsgElementBase[] MsgBody;
    /**
     * 离线推送信息配置，具体可参考 消息格式描述。
     */
    private OfflinePushInfo OfflinePushInfo;

    @Override
    public Class getResponseClass() {
        return SendMsgResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/openim/sendmsg";
    }
}
