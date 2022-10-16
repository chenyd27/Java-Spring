import com.cyd.dao.UserOracleImpl;
import com.cyd.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取applicationContext
        // 获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userService.getUserId();
        userService.setUserDao((UserOracleImpl)applicationContext.getBean("oracleImpl"));
        userService.getUserId();
    }
}
