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
import org.openqa.selenium.WebDriverException;


public class BasePage {
	
	
	private String url;
	public Properties prop;
	public static String screenShotDestinationPath;
	
	public void BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
		
	}
	
	public static WebDriver getDriver() throws IOException, InterruptedException {
	return WebDriverInstance.getDriver();
	}
	
	public String getUrl() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				"C:\\Users\\suvid\\eclipse-workspace\\liveproject1\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
		
		url =prop.getProperty("url");
		return url;

	}
	public static String takeSnapShot(String name) throws IOException, WebDriverException, InterruptedException {
		File srcFile=((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		
		String destFile=System.getProperty("user.dir") + "\\target\\Screenshots\\" 
				+ timestamp() + " .png";
		
		
		screenShotDestinationPath =destFile;	
		try {
			FileUtils.copyFile(srcFile, new File(destFile));
		}catch(IOException e) {
			e.printStackTrace();
		}
		return name;
		
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	public static String getScreenShotDestinationPath() {
		return screenShotDestinationPath;
	}

}
