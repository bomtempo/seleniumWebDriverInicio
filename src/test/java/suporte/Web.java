package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver creatChrome() {
        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "/home/basis/Documentos/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        // Navegando para a página dp Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        return navegador;

    };
}
