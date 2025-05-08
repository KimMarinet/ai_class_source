package exam02;

public class Book {
    private int idbn;
    private String title;
    private String author;

    public Book(int idbn, String title, String author) {
        this.idbn = idbn;
        this.title = title;
        this.author = author;
    }

    public int getIdbn() {
        return idbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idbn=" + idbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
