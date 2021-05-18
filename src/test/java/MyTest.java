import com.joker.pojo.Books;
import com.joker.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}
