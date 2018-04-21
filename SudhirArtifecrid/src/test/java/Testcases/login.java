package Testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	
	
	@Test
	public void validLogin()
	{	
		System.out.println("Sudhir");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:100");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		System.out.println("Logged in successfully");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout successfully");
		driver.close();
		driver.quit();
		
	}

}
