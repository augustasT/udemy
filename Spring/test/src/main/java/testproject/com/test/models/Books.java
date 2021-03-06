package testproject.com.test.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="books")
public class Books {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "title")
    String title;
    @Column (name = "isbn")
    String isbn;
    @Column (name = "publisher")
    String publisher;


   // private Set<Author> authors = new HashSet<>();
    public Books(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Books(String title, String isbn, String publisher, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
       // this.authors = authors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
