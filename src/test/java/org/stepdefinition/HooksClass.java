package org.stepdefinition;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

		@Before
		public void beforeScenario() {
		
			openEdge();
			launchurl("https://www.argos.co.uk/");
			maxWindow();
		}
		
		
		@After
		public void afterScenario(Scenario s) throws IOException {
			if(s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
		}
			
		 closeBrowser();
	}
		
	}


