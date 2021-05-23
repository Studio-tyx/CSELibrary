package service;

import entity.Book;
import dao.BookDao;
import java.util.List;

public class BookService{
    private BookDao bookDao = new BookDao();

    // 获取所有书籍
    public List<Book> getAllBooks()
    {
        return bookDao.getAllBooks();
    }

}