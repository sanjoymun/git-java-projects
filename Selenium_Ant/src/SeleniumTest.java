import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

enum data{
	NORTH;
}
interface mine{
	public void show();
}
abstract class mine_abstract{
	public void test(){
		System.out.println("testing");
	}
	abstract public void test2();
}
public class SeleniumTest extends mine_abstract implements mine{

	@Test
	public void test(){
		data d = data.NORTH;
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.co.in");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("q")).sendKeys("test");
		
		driver.quit();
		

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
}
