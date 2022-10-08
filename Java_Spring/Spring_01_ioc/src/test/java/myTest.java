import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;

public class myTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，dao层他们不需要接触！
        UserServiceImpl userService = new UserServiceImpl();
        // 这样不用改变实现类代码，只需要改变业务参数即可
        userService.setUserDao(new UserDaoMysqlImpl());

        // 会输出dao层的方法
        userService.getUser();

    }
}
