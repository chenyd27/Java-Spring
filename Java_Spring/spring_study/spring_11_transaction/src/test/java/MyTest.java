import com.cyd.mapper.UserMapper;
import com.cyd.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
   @Test
    public void getUsers(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper",UserMapper.class);
        userMapper.deleteUser(8);

   }

}
