package com.Tests;

import com.Pages.PageRegister;
import com.Reports.ExtentReport;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestRegister {

	private WebDriver driver;
	PageRegister pageregister;
	ExtentReports report;
	ExtentTest test1;
	
	@BeforeEach
	public void setUp() throws Exception {
		pageregister = new PageRegister(driver);
		driver =pageregister.chromeDriverConnection();
		pageregister.link("https://parabank.parasoft.com/parabank/index.htm");
		report = ExtentReport.getIntance();
	}
	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
		report.flush();
	}

	@Test
	public void register() throws InterruptedException {
		test1 = report.startTest("Test registro exitoso");
		test1.log(LogStatus.INFO, "Inicia test");
		pageregister.registerUser();
		test1.log(LogStatus.PASS,"Finalizó test correctamente");
		//test1.log(LogStatus.FATAL,"El test no finalizó correctamente");
		report.endTest(test1);
	}
}

