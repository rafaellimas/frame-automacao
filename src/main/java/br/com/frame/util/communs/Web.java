package br.com.frame.util.communs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import br.com.frame.util.interfaces.WebApplication;

public enum Web implements WebApplication {

	CHROME {
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", "/Users/rafael.silva/driver/chromedriver");
			ChromeOptions options = new ChromeOptions();
			return new ChromeDriver(options);
		}


	},

	CHROME_WINDOWS {
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", "chromewindows/chromedriver.exe");
			return new ChromeDriver();
		}

	}

}
