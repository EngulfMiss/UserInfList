package cn.Engulf.server;

import cn.Engulf.domain.PageBean;
import cn.Engulf.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

    /**
     * 登录方法
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 保存数据
     * @param user
     */
    public void addUser(User user);

    /**
     * 删除用户信息
     * @param id
     */
    public void deleteUser(String id);

    /**
     * 根据id查询User对象
     * @param id
     * @return
     */
    public User findUserById(String id);

    /**
     * 更新用户信息
     * @param user
     */
    public void updateUser(User user);

    /**
     * 删除选中用户
     * @param ids
     */
    public void delSelectedUsers(String[] ids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
