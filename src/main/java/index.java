import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

public class index {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        /*WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();*/

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        /*WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();*/

        driver.get("https://sv.wikipedia.org/wiki/Portal:Huvudsida");
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement randomPage = driver.findElement(By.id("n-randompage"));
        Thread.sleep(5000);
        randomPage.click();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        Thread.sleep(5000);
        searchBox.sendKeys("stockholms tekniska institut");
        WebElement searchbtn = driver.findElement(By.id("searchButton"));
        Thread.sleep(5000);
        searchbtn.click();
        System.out.println(driver.getTitle());

        Thread.sleep(10000);
        driver.quit();

        /*//Initializing WebElement for code readability
        WebElement searchButton = driver.findElement(By.id("search"));
        WebElement wikiMainPageLogo = driver.findElement(By.id("p-logo"));
        WebElement searchBox = driver.findElement(By.id("n-randompage"));

        //Checking title change
        System.out.println("Initial title: " + driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5000);

        wikiMainPageLogo = driver.findElement(By.id("p-logo"));
        wikiMainPageLogo.click();
        System.out.println("Current title: " + driver.getTitle());


        //Testing keyboard input in searchBox
        searchBox = driver.findElement(By.id("n-randompage"));
        Thread.sleep(3000);

        searchBox.click();
*//*        Thread.sleep(500);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        searchBox.sendKeys(Keys.ENTER);*//*

        // Search by pressing the search button instead of passing Keys.ENTER
        Thread.sleep(3000);
        wikiMainPageLogo = driver.findElement(By.id("p-logo"));
        wikiMainPageLogo.click();

        searchBox = driver.findElement(By.id("search"));
        searchButton = driver.findElement(By.id("search"));
        searchBox.sendKeys("never gonna give you up");
        Thread.sleep(500);
        searchButton.click();
        Thread.sleep(1000);

        // Get all text in the table of contents and print it to console
        String tableOfContents = driver.findElement(By.id("toc")).getText();
        System.out.println(tableOfContents);


        Thread.sleep(5000);
        driver.quit();*/
    }
}