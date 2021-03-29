import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.itv.basecclass.BaseTest;

public class TC_001 extends BaseTest {

	public static void main(String[] args) {
	
		
		setup("chrome");
		
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mddnagababu1810");
		
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.findElement(By.linkText("Next")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	}

}
