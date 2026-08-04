package task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");

        // Open all social links
        driver.findElement(By.linkText("Facebook")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Twitter")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("YouTube")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Google+")).click();

        // Store URLs
        String facebookUrl = "";
        String twitterUrl = "";
        String youtubeUrl = "";
        String googleUrl = "";

        Set<String> allTabs = driver.getWindowHandles();

        // Switch to each tab
        for (String id : allTabs) {
            driver.switchTo().window(id);
            Thread.sleep(2000);

            String currentUrl = driver.getCurrentUrl();

            // Store URLs
            if (currentUrl.contains("facebook")) {
                facebookUrl = currentUrl;

                // Enter email in Facebook
                try {
                    driver.findElement(By.name("email")).sendKeys("test@gmail.com");
                } catch (Exception e) {
                    System.out.println("Facebook email field not found");
                }
            }

            if (currentUrl.contains("x")) {
                twitterUrl = currentUrl;
            }

            if (currentUrl.contains("youtube")) {
                youtubeUrl = currentUrl;
            }

            if (currentUrl.contains("google")) {
                googleUrl = currentUrl;
            }

            // Print title and page source (first 200 chars)
            System.out.println("TITLE: " + driver.getTitle());
            System.out.println("URL: " + currentUrl);
            System.out.println("PAGE SOURCE: " + driver.getPageSource().substring(0, 200));
            System.out.println("=====================================");
        }

        // Open NEW WINDOW (same session)
        driver.switchTo().newWindow(WindowType.WINDOW);

        // Open YouTube in new window
        if (!youtubeUrl.isEmpty()) {
            driver.get(youtubeUrl);
        } else {
            System.out.println("YouTube URL not captured");
        }        Thread.sleep(2000);

        // Open new TAB in same window
        driver.switchTo().newWindow(WindowType.TAB);

        if (!twitterUrl.isEmpty()) {
            driver.get(twitterUrl);
        } else {
            System.out.println("Twitter URL not captured");
        }

    }
}