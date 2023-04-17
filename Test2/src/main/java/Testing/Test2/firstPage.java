package Testing.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import UtilityPackage.browserLaunch;
public class firstPage {
	WebDriver driver;
	WebElement s1= driver.findElement(By.xpath("//button[@class='btn btn-icon' and @aria-label='Search']"));
	WebElement s2= driver.findElement(By.xpath("//button[@id='hamburger-menu']"));
	WebElement s3=driver.findElement(By.xpath("//a[@class='navbar__tutorial-menu']"));
	
	public static void main(String args[]) {
		
		String n= "Myname";
		switch(n){
		case "Myname":
		System.out.println("ok");
			System.out.println("ok");
			
		/* int [][] a= new int[2][3];
			a[0][0]=1;
			a[0][1]=2;
			a[0][2]=3;
			a[1][1]=4;
			a[1][2]=5; 
		*/
			int[] b= {2,3,4};
			for(int k:b) {
				System.out.println(k);
			}
			
		browserLaunch.chrome("https://chromedriver.chromium.org/downloads");
	}

	}}
