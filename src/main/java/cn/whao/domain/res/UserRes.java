package cn.whao.domain.res;

import cn.whao.common.Result;
import cn.whao.domain.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: UserRes
 * Package: cn.whao.domain.res
 * Description:
 *
 * @Author wanghao
 * @Create 2024-06-24 15:04
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRes {

    private Result result;
    private List<UserVO> userVOList;
}
