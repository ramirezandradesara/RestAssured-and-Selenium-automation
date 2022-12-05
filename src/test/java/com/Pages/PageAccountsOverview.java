package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageAccountsOverview extends BasePage {

    By inputUsername = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By inputPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By login = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By accountsOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");

    By result = By.xpath("//*[@id=\"accountTable\"]/tfoot/tr/td");

    public PageAccountsOverview(WebDriver driver) {
        // TODO Auto-generated constructor stub
    }

    public void accountsOverview() throws InterruptedException {
        // 0. Loguearnos
        teclear("mob13",inputUsername);
        teclear("123123",inputPassword);
        oprimir(login);
        Thread.sleep(2000);

        // 1. Haga clic en <Resumen de cuentas>
        oprimir(accountsOverview);

        // 2. Compruebe si el texto "*El saldo incluye depósitos que pueden estar sujetos a retenciones"
        // está visible en la pantalla
        esperaExplicita(result,"*Balance includes deposits that may be subject to holds",10);
    }
}