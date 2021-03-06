import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordCheckTest {

    private TemplatePasswordCheck cut;

    private final String name = "admin";
    private final String password = "admin";
    private final String invalidName = "not an admin";
    private final String invalidPassword = "not an admin";

    @Before
    public void setup(){
        cut = new TemplatePasswordCheck();
    }

    @Test
    public void loginSuccessful(){
//        Assert.assertTrue(cut.checkLogin(name,password));
        assertThat(cut.checkLogin(name,password)).isTrue();
    }

    @Test
    public void invalidNameAndValidPasswordReturnsFalse(){
        assertThat(cut.checkLogin(invalidName,password)).isFalse();
    }

}
