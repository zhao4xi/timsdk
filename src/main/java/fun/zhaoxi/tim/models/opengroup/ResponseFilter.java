package fun.zhaoxi.tim.models.opengroup;

import lombok.Data;

@Data
public class ResponseFilter {
    private String[] GroupBaseInfoFilter;
    private String[] MemberInfoFilter;
    private String[] AppDefinedDataFilter_Group;
    private String[] AppDefinedDataFilter_GroupMember;

}
