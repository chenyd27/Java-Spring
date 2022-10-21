import com.cyd.mapper.UserMapper;
import com.cyd.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

public class MyTest {
    @Test
    public void selectTest() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper",UserMapper.class);
        for(User user : userMapper.selectUser()){
            System.out.println(user);
        }
    }
}
