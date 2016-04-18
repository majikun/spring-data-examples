package example.springdata.rest.uris;

import java.math.BigDecimal;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitData implements InitializingBean {

    @Autowired
    UserRepository userRepository;
    @Autowired
    BookRepository bookRepository;

    @Override
    public void afterPropertiesSet() throws Exception {

        userRepository.save(new User("olivergierke", "a"));
        userRepository.save(new User("starbucksman", "b"));

        bookRepository.save(newBook(1L, "abc", BigDecimal.TEN));
    }

    private Book newBook(Long id, String name, BigDecimal price) {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setPrice(price);
        return book;
    }
}
