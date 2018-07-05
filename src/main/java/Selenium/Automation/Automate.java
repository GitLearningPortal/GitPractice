package Selenium.Automation;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Automate  {

	public WebDriver getDriver(WebDriver browser,AppProps props){

		String driver = null;	
		driver = props.getAppProps().getProperty("driver");
		System.out.println("driver is : "+driver);
		if(driver.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.driver", "E:\\drivers\\geckodriver.exe");
			browser = new FirefoxDriver();
		}else{
			System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
			browser = new ChromeDriver();
		}
		return browser;
	}
	public void automation(WebDriver browser, Actions action,Robot robot,AppProps props){
		try {


			browser.get(props.getAppProps().getProperty("url"));
			Thread.sleep(3000);
			browser.findElement(By.name("q")).sendKeys(props.getAppProps().getProperty("search"));

			Action enter = action.sendKeys(Keys.ENTER).build();
			enter.perform();

			//robot.keyPress(KeyEvent.VK_ENTER);
			//robot.keyRelease(KeyEvent.VK_ENTER);

			System.out.println("Title : "+browser.getTitle());
			Thread.sleep(3000);
			browser.quit();

			System.out.println("SUCCESS!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
