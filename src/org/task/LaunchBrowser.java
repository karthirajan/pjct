package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\May\\MayDemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement e = driver.findElement(By.name("login_page"));
		
		driver.switchTo().frame(e);
		
		WebElement UserId = driver.findElement(By.name("fldLoginUserId"));
		UserId.sendKeys("Ajith");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		
		WebElement footer = driver.findElement(By.className("footer"));
		String text = footer.getText();
		System.out.println(text);
	
	}

}
