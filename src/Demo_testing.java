import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Demo_testing {

	public static void main(String[] args){
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice//");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	    
	   // int[] arr= new int[5];
	    int[] arr2= {2,3,4,5,6,7};
	    for (int i=0; i<arr2.length; i++)
	    {
	    	System.out.println(arr2[i]);
	    	
	    }
	    
	    for(int i : arr2)
	    {
	    	System.out.println(i);
	    }
	    
	    ArrayList<String> al= new ArrayList<String>();
	    String[] hi= {"om sai ram","hanuman chalisa"};
	    List<String> nstri=Arrays.asList(hi);
	   // nstri.contains(nstri)
	
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.id("name")).sendKeys("aishwarya");
	    driver.findElement(By.id("alertbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    
				
	}

}
