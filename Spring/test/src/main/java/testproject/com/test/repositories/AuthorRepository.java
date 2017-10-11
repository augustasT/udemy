package testproject.com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testproject.com.test.models.Author;

public interface  AuthorRepository  extends JpaRepository<Author, Integer>{
}
