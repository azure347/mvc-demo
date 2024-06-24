package cn.whao.service.impl;

import cn.whao.dao.IUserDao;
import cn.whao.domain.po.User;
import cn.whao.domain.vo.UserVO;
import cn.whao.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Package: cn.whao.service.impl
 * Description: 用户服务实现
 *
 * @Author wanghao
 * @Create 2024-06-24 15:07
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public List<UserVO> queryUserList() {
        List<UserVO> userVOList = new ArrayList<>();
        List<User> users = userDao.queryUserList();

        for (User user : users) {
            UserVO userVO = new UserVO();
            userVO.setUserId(user.getUserId());
            userVO.setUserNickname(user.getUserNickname());
            userVO.setCreateTime(user.getCreateTime());
            userVOList.add(userVO);
        }
        return userVOList;
    }
}
