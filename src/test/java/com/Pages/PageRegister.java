package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegister extends BasePage {
	By buttonRegister = By.linkText("Register");

	By name = By.id("customer.firstName");
	By lastName = By.id("customer.lastName");
	By address = By.id("customer.address.street");
	By city = By.id("customer.address.city");
	By state = By.id("customer.address.state");

	By zipcode = By.id("customer.address.zipCode");
	By phone = By.id("customer.phoneNumber");
	By ssn = By.id("customer.ssn");

	By username = By.id("customer.username");
	By password = By.id("customer.password");
	By rePassword = By.id("repeatedPassword");

	By registerConfirm = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

	By result = By.xpath("//*[@id=\"rightPanel\"]/p");

	public PageRegister(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void registerUser() throws InterruptedException {
		// 1. Haga clic en <Registro>
		oprimir(buttonRegister);
		Thread.sleep(2000);

		// 2. Rellene el formulario de registro con los datos requeridos
		teclear("Mob", name);
		teclear("Kageyama",lastName);
		teclear("1285 Pyramid Valley Road",address);
		teclear("Burlington",city);
		teclear("Iowa",state);

		teclear("52601",zipcode);
		teclear("319-758-8875",phone);
		teclear("008-01-1926",ssn);

		teclear("mob3131",username);
		teclear("123123",password);
		teclear("123123",rePassword);

		Thread.sleep(2000);

		//. 3 Pulse de nuevo en <Registro>.
		oprimir(registerConfirm);

		//. 4 Compruebe que el texto "Su cuenta se ha creado correctamente. En la pantalla se puede ver "You are now logged in"
		esperaExplicita(result,"Your account was created successfully. You are now logged in.",10);
	}
}