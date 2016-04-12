import com.yaopingping.mybatis.models.User;
import com.yaopingping.mybatis.models.UserDao;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class AddUserTest {
    public boolean isAddUserSuccess(User user) {
        UserDao userDao = new UserDao();
        userDao.save(user);
        return true;
    }
}
