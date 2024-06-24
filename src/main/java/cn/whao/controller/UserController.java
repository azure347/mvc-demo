package cn.whao.controller;

import cn.whao.common.Result;
import cn.whao.domain.res.UserRes;
import cn.whao.domain.vo.UserVO;
import cn.whao.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: UserController
 * Package: cn.whao.controller
 * Description:
 *
 * @Author wanghao
 * @Create 2024-06-24 15:13
 * @Version 1.0
 */
@Slf4j
@RestController
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("queryUserInfo")
    public UserRes queryUserInfo() {
        try {
            log.info("查询用户信息");
            List<UserVO> userVOList = userService.queryUserList();
            return UserRes.builder().userVOList(userVOList).result(Result.buildSuccess()).build();
        } catch (Exception e) {
            log.error("查询用户信息失败", e);
            return UserRes.builder().result(Result.buildSuccess()).build();
        }
    }

}
