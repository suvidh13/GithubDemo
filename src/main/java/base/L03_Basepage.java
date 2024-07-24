package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class L03_Basepage {
	
	public static WebDriver driver;
	private String url;
	
	public L03_Basepage() {
		
	}
	
	public WebDriver getDriver() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				"C:\\Users\\suvid\\eclipse-workspace\\liveproject1\\src\\main\\java\\resources\\config.properties");
		prop.load(data);

		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");	
			driver = new ChromeDriver();
		} else if(prop.getProperty("browser").equals("firebox")) {
			
		}else {
			System.setProperty("webdriver.edge.driver","C:\\ChromeDriver\\drivers\\msedgedriver.exe");	
			driver = new EdgeDriver();		
		}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		return driver;
	}
	
	public String getUrl() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				"C:\\Users\\suvid\\eclipse-workspace\\liveproject1\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
		
		url =prop.getProperty("url");
		return url;

	}
	public static void takeSnapShot(String name) throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destFile=new File( System.getProperty("user.dir") + "\\target\\Screenshots\\" 
				+ timestamp() + " .png");
				
		
		FileUtils.copyFile(srcFile, destFile);			
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
