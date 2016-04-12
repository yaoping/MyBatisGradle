import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class PopupTest {
    public static void main(String[] args ) throws InterruptedException
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("http://www.rediff.com/");
        WebElement sign = driver.findElement(By.xpath("//html/body/div[3]/div[3]/span[4]/span/a"));
        sign.click();

        Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
        Iterator<String> itererator = windowId.iterator();

        String mainWinID = itererator.next();
        String  newAdwinID = itererator.next();

        driver.switchTo().window(newAdwinID);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(mainWinID);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        WebElement email_id= driver.findElement(By.xpath("//*[@id='c_uname']"));
        email_id.sendKeys("hi");
        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}
