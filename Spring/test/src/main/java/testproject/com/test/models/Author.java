package testproject.com.test.models;

import javax.persistence.*;

import java.util.Set;

@Entity(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;


    //private Set<Books> books = new HashSet<>();

    public String getFirstName() {
        return firstName;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(Integer id, String firstName, String lastName, Set<Books> books) {
        this.firstName = firstName;
        this.lastName = lastName;
    //    this.books = books;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
