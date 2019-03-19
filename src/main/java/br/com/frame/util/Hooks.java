package br.com.frame.util;

import com.rajatthareja.reportbuilder.report.Scenario;

import br.com.frame.util.communs.Web;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest {
	
	@Before()
	public void beforeScenario() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME);
	}
	
	@After()
	public void afterScenario(Scenario scenario) throws Exception {
		ReportVariables.setNome_cT(scenario.getName());
        ReportVariables.setStatus(scenario.getStatus());
        GeradorWordSteps geradorWordSteps = new GeradorWordSteps();
        geradorWordSteps.generateWord();
        closeWeb();
	}

}
