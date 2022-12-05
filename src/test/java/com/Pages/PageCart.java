package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCart extends BasePage {
	By searchBar = By.xpath("//*[@id=\"search\"]/input");
	By lupa =  By.xpath("//*[@id=\"search\"]/span");

	By addToCartButton = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]");

	By success = By.xpath("//*[@id=\"product-search\"]/div[1]");
	
	public PageCart(WebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
	}
	
	public void addToCart() throws InterruptedException {
		// 1
		teclear("Iphone",searchBar);
		// 2
		oprimir(lupa);
		//3
		oprimir(addToCartButton);
		Thread.sleep(2000);
		comparar(success, "Success: You have added iPhone to your shopping cart!");
	}
}
