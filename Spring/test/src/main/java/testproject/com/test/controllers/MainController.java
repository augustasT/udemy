package testproject.com.test.controllers;

import org.hibernate.engine.spi.Mapping;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import testproject.com.test.domains.AuthorsDomain;
import testproject.com.test.models.Author;

import java.util.List;

@RestController
public class MainController {

    AuthorsDomain authorsDomain;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld(){
        authorsDomain = new AuthorsDomain();
        List<Author> list = authorsDomain.getAllAuthors();

        return list.get(0).getFirstName();
    }
}
