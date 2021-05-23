package entity;

public class Notes {
    private int note_id;                // 自增主键
    private String note_course;         // 笔记所属课程
    private String store_path;          // 存储路径
    private String donate_user_id;      // 捐赠者学号
    private int download_times;         // 下载次数

    public Notes(){}

    public Notes(int note_id, String note_course, String store_path, String donate_user_id, int download_times) {
        this.note_id = note_id;
        this.note_course = note_course;
        this.store_path = store_path;
        this.donate_user_id = donate_user_id;
        this.download_times = download_times;
    }

    public int getNote_id() {
        return note_id;
    }

    public String getNote_course() {
        return note_course;
    }

    public String getStore_path() {
        return store_path;
    }

    public String getDonate_user_id() {
        return donate_user_id;
    }

    public int getDownload_times() {
        return download_times;
    }

    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }

    public void setNote_course(String note_course) {
        this.note_course = note_course;
    }

    public void setStore_path(String store_path) {
        this.store_path = store_path;
    }

    public void setDonate_user_id(String donate_user_id) {
        this.donate_user_id = donate_user_id;
    }

    public void setDownload_times(int download_times) {
        this.download_times = download_times;
    }
}
