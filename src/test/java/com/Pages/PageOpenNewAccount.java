package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageOpenNewAccount extends BasePage{
    /*By searchBar = By.xpath("//*[@id=\"search\"]/input");
    By lupa =  By.xpath("//*[@id=\"search\"]/span");

    By addToCartButton = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]");

    By success = By.xpath("//*[@id=\"product-search\"]/div[1]");*/

    By inputUsername = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By inputPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By login = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By openNewAccount = By.linkText("Open New Account");

    By typeOfAccount = By.xpath("//*[@id=\"type\"]");
    By savings = By.xpath("//*[@id=\"type\"]/option[2]");

    By confirmButton = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");

    By result = By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]");

    public PageOpenNewAccount(WebDriver driver, WebDriverWait wait) {
        // TODO Auto-generated constructor stub
    }

    public void openNewAccount() throws InterruptedException {
        // 0. Loguearnos
        teclear("mob13",inputUsername);
        teclear("123123",inputPassword);
        oprimir(login);
        Thread.sleep(2000);

        // 1. Haga clic en <Abrir nueva cuenta>.
        oprimir(openNewAccount);
        Thread.sleep(2000);

        // 2. En el apartado "¿Qué tipo de cuenta desea abrir?" seleccione la opción <SAVINGS>.
        oprimir(typeOfAccount);
        oprimir(savings);
        Thread.sleep(2000);

        // 3. Haga clic en <Abrir nueva cuenta>
        oprimir(confirmButton);
        Thread.sleep(2000);

        // 4. Compruebe si el texto "Congratulations, your account is now open." está visible en la pantalla
        esperaExplicita(result,"Congratulations, your account is now open.",10);
    }
}
