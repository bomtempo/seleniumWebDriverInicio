package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class informacoesUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.creatChrome();
    }
        @Test
        public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
            new LoginPage(navegador)
                    .clickSignIn()
                    .typeLogin("bomtempo001")
                    .typePassword("12345678");
        }

        @After
                public void tearDown() {
            navegador.quit();
        }

}
