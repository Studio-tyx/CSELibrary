package entity;

import java.sql.Timestamp;

public class Donate_books_apply {
    private int apply_book_id;	        // 自增主键
    private String user_id;				// 捐献者学号
    private String book_name;			// 书名
    private String publisher_name;		// 出版社名称
    private Timestamp apply_time;		// 申请时间
    private Timestamp donate_time;	    // 预约捐献时间

    public Donate_books_apply() {}

    public Donate_books_apply(int apply_book_id, String user_id,
                              String book_name, String publisher_name,
                              Timestamp apply_time, Timestamp donate_time) {
        this.apply_book_id = apply_book_id;
        this.user_id = user_id;
        this.book_name = book_name;
        this.publisher_name = publisher_name;
        this.apply_time = apply_time;
        this.donate_time = donate_time;
    }

    public void setApply_book_id(int apply_book_id) {
        this.apply_book_id = apply_book_id;
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

    public void setApply_time(Timestamp apply_time) {
        this.apply_time = apply_time;
    }

    public void setDonate_time(Timestamp donate_time) {
        this.donate_time = donate_time;
    }

    public int getApply_book_id() {
        return apply_book_id;
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

    public Timestamp getApply_time() {
        return apply_time;
    }

    public Timestamp getDonate_time() {
        return donate_time;
    }
}
