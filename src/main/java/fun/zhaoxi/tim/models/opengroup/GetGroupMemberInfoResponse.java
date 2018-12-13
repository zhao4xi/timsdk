package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
public class GetGroupMemberInfoResponse extends ResponseBase {

    private String MemberNum;
    private List<MemberList> MemberList;
}
