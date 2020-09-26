package testeWebMotors.PAGE;

import static testeWebMotors.CORE.DriveFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	public void escreverCss(String cssSelector, String texto) {
		getDriver().findElement(By.cssSelector(cssSelector)).sendKeys(texto);
	}

	public void clicarCss(String cssSelector) {
		getDriver().findElement(By.cssSelector(cssSelector)).click();
	}

	public void espearPor1s() throws InterruptedException {
		Thread.sleep(1000);
	}

	public void espearPor2s() throws InterruptedException {
		Thread.sleep(2000);
	}

	public String buscarTextoPorCss(String cssSelector) {
		return getDriver().findElement(By.cssSelector(cssSelector)).getText();
	}
}
