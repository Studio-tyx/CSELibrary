package entity;

import java.sql.Timestamp;

public class Donate_notes_apply {
    private int apply_note_id;	        // 自增主键
    private String user_id;				// 捐献者学号
    private String user_name;			// 捐献者姓名
    private String note_course;			// 笔记所属课程
    private Timestamp apply_time;		// 申请时间
    private Timestamp donate_time;		// 预约捐献时间

    public Donate_notes_apply() {}

    public Donate_notes_apply(int apply_note_id, String user_id,
                              String user_name, String note_course,
                              Timestamp apply_time, Timestamp donate_time) {
        this.apply_note_id = apply_note_id;
        this.user_id = user_id;
        this.user_name = user_name;
        this.note_course = note_course;
        this.apply_time = apply_time;
        this.donate_time = donate_time;
    }

    public void setApply_note_id(int apply_note_id) {
        this.apply_note_id = apply_note_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setNote_course(String note_course) {
        this.note_course = note_course;
    }

    public void setApply_time(Timestamp apply_time) {
        this.apply_time = apply_time;
    }

    public void setDonate_time(Timestamp donate_time) {
        this.donate_time = donate_time;
    }

    public int getApply_note_id() {
        return apply_note_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getNote_course() {
        return note_course;
    }

    public Timestamp getApply_time() {
        return apply_time;
    }

    public Timestamp getDonate_time() {
        return donate_time;
    }
}
