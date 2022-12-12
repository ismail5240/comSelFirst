package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
/*
2. Create main method.
3. System.setProperty("","");System.setProperty("webdriver.chrome.driver","/Users/Garry/Documents/seleniumdependencies/drivers/chromedriver");
3. (Windows) System.setProperty("webdriver.chrome.driver","C:\\Users\\Garry\\Documents\\seleniumdependencies\\drivers\\chromedriver.exe");
4. Chrome driver oluşturun.
            WebDriver driver = new ChromeDriver();
5. ''https://www.google.com'’ adresinden google ana sayfasını açın.

 */

    public static void main(String[] args) {

        // 1. adım chorome  drive ın pathini belirliyoruz
        System.setProperty("webdriver.chrome.driver","Dependencies\\driviers\\chromedriver.exe");

        // Adım2 - driver objemizi oluşturduk
        WebDriver driver=new ChromeDriver();
        // Adım 3 goole sitsini ziyaret ettik
        driver.get("https://www.google.com");
    }

}
