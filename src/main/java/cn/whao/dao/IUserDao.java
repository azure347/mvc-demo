package cn.whao.dao;

import cn.whao.domain.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: UserDao
 * Package: cn.whao.dao
 * Description: 用户的DAO操作
 *
 * @Author wanghao
 * @Create 2024-06-24 14:47
 * @Version 1.0
 */
@Mapper
public interface IUserDao {

    List<User> queryUserList();
}
