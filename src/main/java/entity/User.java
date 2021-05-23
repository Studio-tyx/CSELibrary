package entity;

public class User {
    private String user_id;     // 学号
    private String user_name;   // 用户名
    private String password;    // 密码
    int available_amount;       // 剩余可借数量

    public User() {}

    public User(String user_id, String user_name, String password, int available_amount)
    {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.available_amount = available_amount;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public int getAvailable_amount() {
        return available_amount;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAvailable_amount(int available_amount) {
        this.available_amount = available_amount;
    }
}