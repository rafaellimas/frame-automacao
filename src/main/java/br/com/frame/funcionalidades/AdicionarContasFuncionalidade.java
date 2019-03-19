package br.com.frame.funcionalidades;

import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.frame.pages.AdicionarPage;
import br.com.frame.pages.HomePage;
import br.com.frame.util.BaseTest;
import br.com.frame.util.Randon;


public class AdicionarContasFuncionalidade extends BaseTest  {
	
	private HomePage home;
	private AdicionarPage adicionar;
	
	public void clickAdicionar() {
		this.home = new HomePage(webDriver); 
		wait.until(ExpectedConditions.elementToBeClickable(this.home.getDropDownContas()));
		this.home.getDropDownContas().click();
		wait.until(ExpectedConditions.visibilityOf(this.home.getContasAdicionar()));
		this.home.getContasAdicionar().click();
	}
	
	public void adicionarUsuario() {
		this.adicionar = new AdicionarPage(webDriver); 
		wait.until(ExpectedConditions.visibilityOf(this.adicionar.getTextFild()));
		this.adicionar.getTextFild().sendKeys(Randon.fakeGenerator());
		this.adicionar.getBtnSalvar().click();
		
	}
	
	public String obterTextoConfirmacao() {
		this.adicionar = new AdicionarPage(webDriver); 
		wait.until(ExpectedConditions.visibilityOf(this.adicionar.getMsgConfirmacao()));
		return this.adicionar.getMsgConfirmacao().getText();
	}

}
