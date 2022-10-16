import com.cyd.pojo.Address;
import com.cyd.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Address address =  applicationContext.getBean("address2",Address.class);
        System.out.println(address.toString());
    }
}
