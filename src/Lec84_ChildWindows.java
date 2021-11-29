import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lec84_ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver1_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		driver.manage().window().maximize();
		
		//Get the no of window
		Set<String> s= driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.print(email);
		
	}

}
