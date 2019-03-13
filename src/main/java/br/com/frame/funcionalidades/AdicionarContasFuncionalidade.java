package br.com.frame.funcionalidades;

import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.frame.pages.AdicionarPage;
import br.com.frame.pages.HomePage;
import br.com.frame.util.BaseTest;


public class AdicionarContasFuncionalidade extends BaseTest  {
	
	private HomePage home;
	private AdicionarPage adicionar;
	
	public AdicionarContasFuncionalidade() {
		this.home = new HomePage(webDriver);
		this.adicionar = new AdicionarPage(webDriver);
	}
	
	public void clickAdicionar() {
//		wait.until(ExpectedConditions.elementToBeClickable(this.home.getDropDownContas()));
		this.home.getCriarMovimentacao().click();
		wait.until(ExpectedConditions.visibilityOf(this.home.getContasAdicionar()));
		this.home.getContasAdicionar().click();
	}
	
	public void adicionarUsuario(String novoUsuario) {
		wait.until(ExpectedConditions.visibilityOf(this.adicionar.getTextFild()));
		this.adicionar.getTextFild().sendKeys(novoUsuario);
		this.adicionar.getBtnSalvar().click();
		
	}
	
	public String obterTextoConfirmacao() {
		wait.until(ExpectedConditions.visibilityOf(this.adicionar.getMsgConfirmacao()));
		return this.adicionar.getMsgConfirmacao().getText();
	}

}
