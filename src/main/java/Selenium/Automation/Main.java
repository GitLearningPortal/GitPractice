package Selenium.Automation;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


/**
 * Hello world!
 *
 */
public class Main 
{
	public static void main( String[] args ) throws AWTException
	{
		WebDriver abc = null;
		System.out.println( "Hello World!" );

		//properties file data
		AppProps props = new AppProps();
		Automate automate = new Automate();
		WebDriver browser = automate.getDriver(abc,props);

		//key press events 2 methods actions and robot
		Actions action = new Actions(browser);
		Robot robot = new Robot();

		automate.automation(browser,action,robot,props);

	}
}
