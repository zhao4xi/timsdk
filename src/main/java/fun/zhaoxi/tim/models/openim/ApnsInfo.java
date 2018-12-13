package fun.zhaoxi.tim.models.openim;

import lombok.Data;

@Data
public class ApnsInfo {

    /**
     * 离线推送声音文件路径 选填
     */
    private String Sound;
    /**
     * 这个字段缺省或者为 0 表示需要计数，为 1 表示本条消息不需要计数，即右上角图标数字不增加 选填
     */
    private Integer BadgeMode;
    /**
     * 该字段用于标识apns推送的标题，若填写则会覆盖最上层Title 选填
     */
    private String Title;
    /**
     * 该字段用于标识apns推送的子标题 选填
     */
    private String SubTitle;
    /**
     * 该字段用于标识apns携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上 选填
     */
    private String Image;


}
