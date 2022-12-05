package com.Tests;

import com.Pages.PageCart;
import com.Pages.PageRegister;
import com.Reports.ExtentReport;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestCart {
	
	private WebDriver driver;
	PageCart pageCart;
	ExtentReports report;
	ExtentTest test1;
	
	@BeforeEach
	public void setUp() throws Exception {
		pageCart = new PageCart(driver, null);
		driver =pageCart.chromeDriverConnection();
		pageCart.link("https://opencart.abstracta.us/index.php?route=common/home");
		report = ExtentReport.getIntance();
	}

	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
		report.flush();
	}

	@Test
	public void addToCart() throws InterruptedException {
		/*test1 = report.startTest("Test agregar a carrito exitoso");
		test1.log(LogStatus.INFO, "Inicia test");
		pageCart.addToCart();
		test1.log(LogStatus.PASS,"Finalizó test correctamente");
		//test1.log(LogStatus.FATAL,"El test no finalizó correctamente");
		report.endTest(test1);*/


	}

}
