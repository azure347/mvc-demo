package cn.whao.service;

import cn.whao.domain.vo.UserVO;

import java.util.List;

/**
 * ClassName: IUserService
 * Package: cn.whao.service
 * Description:
 *
 * @Author wanghao
 * @Create 2024-06-24 15:06
 * @Version 1.0
 */
public interface IUserService {

    List<UserVO> queryUserList();
}
