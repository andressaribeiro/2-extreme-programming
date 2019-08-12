package curso.xp;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService = new UserService();

    @Test
    public void isUserLogged() {
        assertTrue(userService.isUserLogged());
    }
}