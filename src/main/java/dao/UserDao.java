package dao;

import entity.User;
import org.apache.ibatis.session.SqlSession;
import tools.MybatisUtils;
import java.util.List;

public class UserDao {
    private String namespace = "UserMapper.";
    // 查询某个用户
    public User getUserByID(String user_id)
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        User user = sqlSession.selectOne(namespace + "judge_login", user_id);
        sqlSession.close();
        return user;
    }
}
