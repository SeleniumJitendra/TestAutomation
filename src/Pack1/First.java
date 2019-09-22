// comment entered by aniket
//comment for checking the pull functionlity


package Pack1;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Desktop/Selenium/Chrome Driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    
    
    //======  Handle Window Popup
    
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	WebElement webelm = driver.findElement(By.name("proceed"));
	webelm.click();

	Alert al = driver.switchTo().alert();

	String s= al.getText();

	System.out.println(s);
	Thread.sleep(5000);
	//al.dismiss(); // To click on the 'Cancel' button of the alert.
	al.accept(); //To click on the 'OK' button of the alert.

    
    
    //==== Web Tbale
		/*
		 * driver.get("file:///C:/Users/DELL/Desktop/Durgesh/Html/Table.html");
		 * 
		 * String
		 * s=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]")).getText();
		 * System.out.println("The Select value is :- "+s); driver.close();
		 */
    
    
    
    //====================================Drop Down
    
		/*
		 * driver.get("file:///C:/Users/DELL/Desktop/Durgesh/Html/DropDown.html");
		 * 
		 * Select dropDown = new Select (driver.findElement(By.name("cars")));
		 * 
		 * dropDown.selectByValue("BMW"); //dropDown.selectByIndex(3);
		 * 
		 * List<WebElement> e = dropDown.getOptions(); int itemsCount = e.size();
		 * System.out.println(" Total Number of Item ="+itemsCount); //driver.close();
		 * 
		 */
    
    
    
   //======================= Radio button Operations
    
    
		/*
		 * driver.get("file:///C:/Users/DELL/Desktop/Durgesh/Html/Radio.html");
		 * WebElement RadioButton = driver.findElement(By.xpath("/html/body/input[3]"));
		 * 
		 * System.out.println(RadioButton.isEnabled());
		 * System.out.println(RadioButton.isDisplayed());
		 * System.out.println(RadioButton.isSelected()); Thread.sleep(5000);
		 * RadioButton.click(); Thread.sleep(5000);
		 * System.out.println(RadioButton.isSelected()); driver.close();
		 */
    
    
   // =========== All Check box
    
		/*
		 * driver.get("file:///C:/Users/DELL/Desktop/Durgesh/Html/Checkbox.html");
		 * List<WebElement> checkboxes = driver.findElements(By.name("vehicle"));
		 * System.out.println("Number of Checkbox:- "+checkboxes.size());
		 * 
		 * driver.close();
		 */
    
    
    //======== All links 
    
		/*
		 * driver.get("http://yahoo.com/"); List<WebElement> allLinks =
		 * driver.findElements(By.tagName("a"));
		 * 
		 * System.out.println(allLinks.size());
		 * 
		 * for (int i = 0; i<allLinks.size(); i=i+1) {
		 * System.out.println(allLinks.get(i).getText()); }
		 * 
		 * driver.close();
		 */
    
    
    
    
   // =============== GEt Text 
		/*
		 * driver.get("https://en.wikipedia.org/wiki/Main_Page"); WebElement webelm =
		 * driver.findElement(By.id("mp-itn-h2"));
		 * 
		 * System.out.println(webelm.getText()); Thread.sleep(5000);
		 */
    
    
		/*
		 * //===WebDriver driver.manage().window().maximize();
		 * 
		 * driver.get("http://demo.guru99.com/V4/index.php");
		 * 
		 * driver.findElement(By.linkText("here")).click();
		 *  WebElement ent = driver.findElement(By.name("emailid")); ent.sendKeys("Test@gmail.com");
		 * Thread.sleep(6000);
		 * 
		 * //Enable status
		 * System.out.println("The isEnabled Status :- "+ent.isEnabled()); //Displayed
		 * status System.out.println("The isDisplayed Status :- "+ent.isDisplayed());
		 * 
		 * //Return the Value
		 * 
		 * String atValue=ent.getAttribute("type");
		 * System.out.println("Value of attribute: "+atValue);
		 * 
		 * 
		 * driver.quit();
		 */
		/*
		 * // dur.manage().window().maximize(); // dur.manage().deleteAllCookies();
		 * dur.manage().window().maximize(); dur.get("https://accounts.google.com");
		 * dur.findElement(By.id("identifierId")).sendKeys("sawkhedkar.durgesh");
		 * 
		 * dur.findElement(By.id("identifierId")).clear();
		 * dur.navigate().to("http://demo.guru99.com/V4/index.php");
		 * 
		 * dur.navigate().back(); dur.quit();
		 */
    //dur.close();
	}
}
