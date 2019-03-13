package br.com.frame.funcionalidades;

import br.com.frame.pages.LoginHerokuPage;
import br.com.frame.util.BaseTest;
import br.com.frame.util.communs.Web;

public class LoginFuncionalidade extends BaseTest {

	private LoginHerokuPage login;

	public void LoginSrBarriga(String user) {
		initializeWebApplication(Web.CHROME);
		webDriver.get("https://srbarriga.herokuapp.com/login/");
		this.login = new LoginHerokuPage(webDriver);
		
		login.getEmail().sendKeys(user+"@yaman.com.br");
		login.getSenha().sendKeys("_123@Yaman");
		login.getBtnEntrar().click();
	}

}
