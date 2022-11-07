package website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2095765\\OneDrive - Cognizant\\Desktop\\workspace\\Website_Automation\\driver\\chromedriver.exe");
		
		//Handling notifications
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		
		//launching Myntra website
		driver.get("https://www.myntra.com/");
		 
		//maximizing window
		driver.manage().window().maximize();
		
		//Mouse hover on Kids
		WebElement ele = driver.findElement(By.xpath("//div[@class='desktop-navLink' and @data-reactid='334']"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
	    Thread.sleep(2000);
	    
	    //Clicks on footwear
		action.moveToElement(ele).moveToElement(driver.findElement(By.linkText("Footwear"))).click().build().perform();

		//build()- used to compile all the actions into a single step 
		action.click().build().perform();
		
		//selects girl radio button
		
		WebElement Girls = driver.findElement(By.xpath("//label[@class='common-customRadio gender-label']/input[@value='girls,boys girls']"));
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",Girls);
		 Thread.sleep(3000);
		 
		 //Selects Flats category
		
		 WebElement Flats = driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']/input[@value='Flats']"));
		 JavascriptExecutor js1=(JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].click();",Flats);
		 Thread.sleep(3000);
		 
		
		 /*Selects Brand
		 
		 WebElement brand1= driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']/input[@value='max']"));
		 JavascriptExecutor js2=(JavascriptExecutor) driver;
		 js2.executeScript("arguments[0].click();",brand1);
		 Thread.sleep(3000);
		 
		 WebElement brand2= driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']/input[@value='toothless']"));
		 JavascriptExecutor js3=(JavascriptExecutor) driver;
		 js3.executeScript("arguments[0].click();",brand2);
		 Thread.sleep(3000);*/
		 
		 
	      //selects discount range
		 
	      WebElement discount= driver.findElement(By.xpath("//label[@class='common-customRadio vertical-filters-label']/input[@value='30.0 TO 100.0']"));
			 JavascriptExecutor js4=(JavascriptExecutor) driver;
			 js4.executeScript("arguments[0].click();",discount);
			 Thread.sleep(3000);
			 
			//Scroll till discount range
				
		      WebElement l=driver.findElement(By.xpath("//*[text()='Discount Range']"));
		      // Javascript executor
		      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
		      Thread.sleep(3000);
		      
		      //Displays the product name 
		      
		      /*List<WebElement> brand = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
    
		      List<WebElement> price = driver.findElements(By.xpath("//div[@class='product-price']"));
		        System.out.println(brand.size());

		        System.out.println(" Displyning Product name and Price:");
		        
		        for (WebElement webElement : brand:) {
		            String name = webElement.getText();
		            System.out.println(name);
		        }
		        for (WebElement webElement : price) {
		            String amount = webElement.getText();
		            System.out.println(amount);
		        } */
		      
		      System.out.println(" Displaying Product name and Price:");
		        //product name
		        List<WebElement> Ptitle=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		        
		        //product price
		        List<WebElement> Pprice=driver.findElements(By.xpath("//div[@class='product-price']"));
		       

		        for(int i=0;i<Ptitle.size();i++){
		            
		            System.out.println("Product Name:" + Ptitle.get(i).getText());
		            System.out.println("Product Price:" + Pprice.get(i).getText());
		           
		            System.out.println("==================================================");
		        }
		        
		        driver.close();
		      
	}
	
}




