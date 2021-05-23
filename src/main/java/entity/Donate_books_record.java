package entity;

import java.sql.Timestamp;

public class Donate_books_record {
    private int donate_book_id;		    // 自增主键
    private String user_id;				// 捐献者学号
    private String book_name;			// 书名
    private String publisher_name;		// 出版社名称
    private Timestamp donate_time;		// 捐献时间

    public Donate_books_record() {}

    public Donate_books_record(int donate_book_id, String user_id,
                               String book_name, String publisher_name, Timestamp donate_time) {
        this.donate_book_id = donate_book_id;
        this.user_id = user_id;
        this.book_name = book_name;
        this.publisher_name = publisher_name;
        this.donate_time = donate_time;
    }

    public void setDonate_book_id(int donate_book_id) {
        this.donate_book_id = donate_book_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public void setDonate_time(Timestamp donate_time) {
        this.donate_time = donate_time;
    }

    public int getDonate_book_id() {
        return donate_book_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public Timestamp getDonate_time() {
        return donate_time;
    }
}
