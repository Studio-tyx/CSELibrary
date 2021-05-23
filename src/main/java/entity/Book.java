package entity;

public class Book{
    private int book_id;                // 主键
    private String book_name;           // 书名
    private String publisher_name;      // 出版社
    private int left_num;               // 剩余数量

    public Book() {}

    public Book(int book_id, String book_name, String publisher_name, int left_num)
    {
        this.book_id = book_id;
        this.book_name = book_name;
        this.publisher_name = publisher_name;
        this.left_num = left_num;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public void setLeft_num(int left_num) {
        this.left_num = left_num;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public int getLeft_num() {
        return left_num;
    }
}