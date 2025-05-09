package exam05;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private String pulisher;

    public Book(int isbn, String title, String author, String pulisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pulisher = pulisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pulisher='" + pulisher + '\'' +
                '}';
    }
}
