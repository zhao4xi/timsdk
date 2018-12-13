package fun.zhaoxi.tim.models.openmsg;

import lombok.Data;

@Data
public class HistoryFile {
    /**
     * 消息记录文件下载地址
     */
    private String URL;
    /**
     * 下载地址过期时间，请在过期前进行下载，若地址失效，请通过该接口重新获取
     */
    private String ExpireTime;
    /**
     * GZip 压缩前的文件大小（单位 Byte）
     */
    private Integer FileSize;
    /**
     * GZip 压缩前的文件 MD5
     */
    private String FileMD5;
    /**
     * GZip 压缩后的文件大小（单位 Byte）
     */
    private Integer GzipSize;
    /**
     * GZip 压缩后的文件 MD5
     */
    private String GzipMD5;
}
