import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
WebDriver wd;

@Test
    public void start(){
    wd = new ChromeDriver();
    wd.get("http://www.google.com");
    wd.quit();
}




}
