package userValidationTest;

import org.junit.Test;
import user.User;
import user.UserValidator;

public class UserValidatorTest {

    private User user = new User("180102122322h");
    private UserValidator validUser = new UserValidator();
    @Test
    public void test(){
        validUser.validate(user);
    }

}