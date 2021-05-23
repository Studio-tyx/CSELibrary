package dao;

import org.apache.ibatis.session.SqlSession;
import tools.MybatisUtils;
import java.util.List;
import entity.Book;

public class BookDao{
    // 获取所有书籍
    public List<Book> getAllBooks()
    {
        // 通过 MyBaits 获得所有书籍
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<Book> list;
        // 通过 mapper 文件中语句查询
        list = sqlSession.selectList("BookMapper.get_all_books");
        // 关闭 sql 连接
        sqlSession.close();
        return list;
    }

}