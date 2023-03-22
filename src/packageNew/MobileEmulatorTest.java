package packageNew;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.emulation.Emulation;

public class MobileEmulatorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//charu//Downloads//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  //why not WebDriver driver here? because if we use WebDriver,then it
		//means we agree to use WD interface methods only,but here we want to use Chrome Driver methods,that's why we use ChromeDriver.
		DevTools devTools = driver.getDevTools();   //to obtain chrome dev tools
		devTools.createSession();
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		//sel. gives cmnds to CDP protocols which will invoke chrome dev tools.
		//in this TC, we are thinking of emulating the device like what we do manually inspect->iphone/pixel7,etc.
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");  //get the site URL
		driver.findElement(By.className("navbar-toggler")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Library")).click();
		System.out.println("HELLOOOOOOO BYEEEE");
		
	}

}
