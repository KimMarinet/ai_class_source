package exam01;

import java.util.Objects;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private String publisher;

    public Book(int isbn, String title, String author, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", hash=" + hashCode() + '\'' +
                '}'
                ;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book book && isbn == book.isbn && title.equals(book.title) && author.equals(book.author) && publisher.equals(book.publisher)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, publisher);
    }
}
