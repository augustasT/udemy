package testproject.com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testproject.com.test.models.Books;

public interface BookRepository extends JpaRepository<Books, Integer>{

}
