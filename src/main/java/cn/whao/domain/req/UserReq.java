package cn.whao.domain.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: UserReq
 * Package: cn.whao.domain.req
 * Description: 请求对象
 *
 * @Author wanghao
 * @Create 2024-06-24 15:03
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserReq {

    private String uId;
}
