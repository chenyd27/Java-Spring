import com.cyd.config.CydConfig;
import com.cyd.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 如果完全使用了配置类方法去做，我们就只能通过 AnnotationConfig 上下文来获取容器，通过配置类的class 对象加载
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CydConfig.class);
        User user = applicationContext.getBean("getUser2",User.class); // 方法名和返回的类名
        System.out.println(user.toString());
        User user1 = applicationContext.getBean("getUser",User.class);
        System.out.println(user1.toString());
    }
}
