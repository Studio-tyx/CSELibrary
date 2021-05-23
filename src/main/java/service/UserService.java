package service;

import dao.UserDao;
import entity.User;

public class UserService {
    private UserDao userDao = new UserDao();

    // 判断用户是否能够成功登录
    public User login(String user_id, String password)
    {
        User user = userDao.getUserByID(user_id);
        if(user == null || (!user.getPassword().equals(password)))
            return null;    // 学号非法 或者 密码不正确 返回 null
        return user;
    }
}
