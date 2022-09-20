package TestsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {	
	public void loginFunc(String uName, String pWord) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\ab\\Selenium\\chromedriver.exe");
	    // Instantiate a ChromeDriver class.
	    WebDriver  driver = new ChromeDriver();
	    
	    try {
	    	driver.get("https://sampleLoginForm.com");
	    	// initate the website link
	    	
	    	// Get the necessary elements
	    	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		    WebElement passwordElement = driver.findElement(By.xpath("//input[@name='pass']"));
		    WebElement loginBtnElement = driver.findElement(By.xpath("//button[@name='login']"));
		    
		    // Pass in the values for the username and password
		    username.sendKeys(uName); 
		    passwordElement.sendKeys(pWord);	    
		    loginBtnElement.click(); 
		    
		    // URL to be directed after loggin in (testing purposes)
		    String actualUrl="https://sampleloginform.com/loggedin"; 
		    String expectedUrl= driver.getCurrentUrl(); 
		    
		    // if actual and expected are same then Test Passed
		    if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
		    	System.out.println("Test passed"); 
		    	} 
		    else { 
		    	System.out.println("Test failed"); 
		    	}   
		} 
	    
	    // Catch Error in case of any errors during the process
	    catch (Exception e) {	
			System.out.println(e.getMessage());	
		}
    
	}

} 

