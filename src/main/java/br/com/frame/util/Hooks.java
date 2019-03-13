package br.com.frame.util;

import br.com.frame.util.communs.Web;
import cucumber.api.java.Before;

public class Hooks extends BaseTest {
	
	@Before(value = "@web")
	public void beforeScenarioWebWindows() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME);
	}
	
//	@After(value = "@web")
//	public void closeApplication() {
//		closeWeb();
//	}

}
