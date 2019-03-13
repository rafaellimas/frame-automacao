package br.com.runTest;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.frame.util.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * @author rafael.silva
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, 
				features = {"resources//"},
				glue = {"br.com.frame.steps"},
				
		
		tags = {"@teste"})

public class Runner extends BaseTest {
	
	@AfterClass
	public static void AfterTest() {
		if(webDriver != null)
			closeWeb();
	}

}
