package cn.whao.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: UserVO
 * Package: cn.whao.domain.vo
 * Description:
 *
 * @Author wanghao
 * @Create 2024-06-24 15:02
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {

    private String userId;
    private String userNickname;
    private Date createTime;
}
