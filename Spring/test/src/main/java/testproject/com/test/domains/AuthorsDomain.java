package testproject.com.test.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import testproject.com.test.models.Author;
import testproject.com.test.repositories.AuthorRepository;

import java.util.List;

@Component
public class AuthorsDomain {
    @Autowired
    AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }


}
