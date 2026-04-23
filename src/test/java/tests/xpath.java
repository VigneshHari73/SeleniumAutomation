package tests;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class xpath {

	public static void main(String[] args) {

		// byclass name
		// driver.findElement(By.xpath("//h2[@class=\"blog-desk-heading\"][1]"));
		// driver.findElement(By.id("Understanding-XPath-contains-in-Selenium"));
		// img[@class="custom-logo"]

		// button[text()='Submit']

		// a[contains(text(),'Youtube')]

		// a[starts-with(text(),'SelectorsHub ')]

		// input[@class='nameFld' and @name="test"]

		// div[@class="userform"]/input

		// input[@id="shub1"]/ancestor::div

		// div[@data-element_type="container"]//descendant::div

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> colummn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));

		System.out.println(headers.size());

		for (int i = 0; i < headers.size(); i++) {

			System.out.println(headers.get(i).getText());

		}
		
		for (WebElement webElement : colummn) {
			String text = webElement.getText();	
			System.out.println(text);
		}
		

		driver.close();
	}

}
