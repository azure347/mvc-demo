package cn.whao.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: User
 * Package: cn.whao.domain.po
 * Description:
 *
 * @Author wanghao
 * @Create 2024-06-24 14:45
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 用户ID
     */
    private Long id;
    /**
     * 用户名称
     */
    private String userId;
    /**
     * 用户昵称
     */
    private String userNickname;
    /**
     * 用户头像
     */
    private String userHead;
    /**
     * 账号密码
     */
    private String userPassword;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

}
