import com.cyd.service.UserService;
import com.cyd.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理代理的是接口，不是实现类
        UserService userService =  applicationContext.getBean("userService",UserService.class);

        userService.add();
    }
}
