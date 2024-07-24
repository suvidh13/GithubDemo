package base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class hooks extends BasePage{

	public hooks() throws IOException{
		super();
	}
	
	@BeforeTest
	public void setup()  throws IOException, InterruptedException {
		getDriver().get(getUrl());
	}
	
	@AfterTest
	public void tearDown() {
		WebDriverInstance.cleanupDriver();
	}
}

