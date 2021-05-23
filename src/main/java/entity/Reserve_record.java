package entity;

import java.sql.Timestamp;

public class Reserve_record {
    private String user_id;			            //预约用户学号
    private int book_id;					    // 预约书籍主键
    private String book_name;				    // 预约书籍名称
    private Timestamp take_book_start_time;		// 预约取书时间段起点
    private Timestamp take_book_end_time;	    // 预约取书时间段终点

    public Reserve_record() {}

    public Reserve_record(String user_id, int book_id, String book_name,
                          Timestamp take_book_start_time, Timestamp take_book_end_time) {
        this.user_id = user_id;
        this.book_id = book_id;
        this.book_name = book_name;
        this.take_book_start_time = take_book_start_time;
        this.take_book_end_time = take_book_end_time;
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

    public Timestamp getTake_book_start_time() {
        return take_book_start_time;
    }

    public Timestamp getTake_book_end_time() {
        return take_book_end_time;
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

    public void setTake_book_start_time(Timestamp take_book_start_time) {
        this.take_book_start_time = take_book_start_time;
    }

    public void setTake_book_end_time(Timestamp take_book_end_time) {
        this.take_book_end_time = take_book_end_time;
    }
}
