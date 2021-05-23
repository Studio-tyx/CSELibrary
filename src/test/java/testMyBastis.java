import entity.User;
import service.*;

import java.util.List;
import entity.Book;

public class testMyBastis {
    public static void main(String []args)
    {
        BookService bookService = new BookService();
        List<Book> bookList = bookService.getAllBooks();
        for (Book book: bookList)
        {
            System.out.println(book.getBook_id() + " " + book.getBook_name() + " "
                                + book.getPublisher_name() + " " + book.getLeft_num());
        }

        UserService userService = new UserService();
        User user = userService.login("root", "eFiQUB!&ucteM%Ddv~-?$qv*Yy%!nqT)*E1%xIFJhtGIhi");
        if(user == null)
        {
            System.out.println("null");
        }
        else
        {
            System.out.println(user.getUser_id() + "  " + user.getPassword());
        }
    }
}
