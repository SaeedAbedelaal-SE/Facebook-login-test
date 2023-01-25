package third_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://ar-ar.facebook.com");
		driver.findElement(By.id("email")).sendKeys("0599995077");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_9ay7']//a[contains(text(),'هل نسيت كلمة السر؟')]")).click();

	}

}
