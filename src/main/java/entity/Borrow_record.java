package entity;

import java.sql.Timestamp;

public class Borrow_record {
    private String user_id;             // 借阅用户学号
    private int book_id;                // 借阅书籍主键
    private String book_name;			// 借阅书籍名称
    private Timestamp borrow_time;		// 借阅时间
    private Timestamp  return_time;     // 应归还时间

    public Borrow_record(){}

    public Borrow_record(String user_id, int book_id, String book_name, Timestamp borrow_time, Timestamp return_time) {
        this.user_id = user_id;
        this.book_id = book_id;
        this.book_name = book_name;
        this.borrow_time = borrow_time;
        this.return_time = return_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public Timestamp getBorrow_time() {
        return borrow_time;
    }

    public Timestamp getReturn_time() {
        return return_time;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setBorrow_time(Timestamp borrow_time) {
        this.borrow_time = borrow_time;
    }

    public void setReturn_time(Timestamp return_time) {
        this.return_time = return_time;
    }
}
