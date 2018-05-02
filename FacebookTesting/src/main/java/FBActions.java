import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.java2d.cmm.Profile;

import java.util.concurrent.TimeUnit;

public class FBActions extends CommonAPI{
    System.setProperty("webdriver.chrome.driver", "\\Users\\prisc\\IdeaProjects\\SocialMediaAutomationFramework\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    //Open Browser
    public void LaunchFB();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    //2. Validate Title Page
            System.out.println(driver.getTitle());

    //3. Validate URL
            System.out.println(driver.getCurrentUrl);

     //4. Print out the page source
            System.out.println(driver.getPageSource());

    //5. Login with Incorrect Email and Correct Password
            driver.findElement(By.id("email")).sendKeys("abc123@hotmail.com");
            driver.findElement(By.name("pass")).sendKeys("SocialMediaTeam2");
            driver.findElement(By.xpath("//*[@id='u_0_9']")).click();



            //5. Login with Correct Email but Incorrect Password
            driver.findElement(By.id("email")).sendKeys("prisgray861@hotmail.com");
            driver.findElement(By.name("pass")).sendKeys("abc123");
            driver.findElement(By.xpath("//*[@id='u_0_9']")).click();



            //7. Login with Incorrect email and password
            driver.findElement(By.id("email")).sendKeys("abc123@hotmail.com");
            driver.findElement(By.name("pass")).sendKeys("zyxw4321");
            driver.findElement(By.xpath("//*[@id='u_0_9']")).click();

        /*8. Confirm that you are on Correct Profile Page
        Capture the Profile name*/
            System.out.println(driver.findElement(By.xpath("//*[@id=\'fb-timeline-cover-name\']/a")).getAttribute("href"));

            //9. Type a bio for the Profile
            driver.findElement(By.xpath("//*[@id=\'profile_intro_card_bio\']/div/div/a")).click();
            driver.findElement(By.xpath("//*[@id=\"profile_intro_card_bio\"]/div/div/form/textarea")).sendKeys("My name is TeamTwo Social Media.");
            driver.findElement(By.xpath("//*[@id=\"profile_intro_card_bio\"]/div/div/form/div/div[2]/div[2]/div/button[2]")).click();

            //10. Add Profile picture
            driver.findElement(By.xpath("//*[@id=\"u_fetchstream_5_5\"]/img")).click();
            driver.findElement(By.xpath("//*[@id=\"js_3o3\"]")).click();

            //11.



//4. Login with correct credentials
            driver.findElement(By.id("email")).sendKeys("prisgray861@hotmail.com");
            driver.findElement(By.name("pass")).sendKeys("SocialMediaTeam2");
            driver.findElement(By.xpath("//*[@id='u_0_9']")).click();









