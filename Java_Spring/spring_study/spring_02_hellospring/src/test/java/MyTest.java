import com.cyd.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 用 xml 加载就必须写这个
        // 获取 spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 我们的对象现在都在 spring 管理，要使用，直接去取出来就可以了！
        // 从容器中取出 变量
        Hello hello = (Hello) context.getBean("hello3");
        hello.show();
    }
}
