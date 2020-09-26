package testeWebMotors.PAGE;

import testeWebMotors.CORE.DriveFactory;

public class ConsultarCarroPAGE extends BasePage {

//-----ACESSAR_URL-------------------------------------------------------------------------------------------------------------------------

	public void acessarUrlWebMotors() {
		DriveFactory.getDriver().get("https://www.webmotors.com.br/");
	}

//-----MÉTODO_ESCREVER-------------------------------------------------------------------------------------------------------------------------

	public void inserirNome(String nome) {
		escreverCss("#searchBar", nome);
	}

//-----MÉTODO_CLICAR-------------------------------------------------------------------------------------------------------------------------

	public void clicarBusca() {
		clicarCss(
				"#WhiteBox > div.NavBar > div.NavBar--content > div > div > div > div > div > div > a > div.SearchBar__results__result__name");
	}

	public void clicarVerVersoes() {
		clicarCss("div.Filters__line--icon--right:nth-child(3)");
	}

//-----MÉTODO_RETORNA_TEXTO-------------------------------------------------------------------------------------------------------------------------

	public String retornaMarcaCarro() {
		return buscarTextoPorCss(".NavItem > form:nth-child(1) > div:nth-child(3) > div:nth-child(1)");
	}

	public String retornaModeloCarro() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Filters__container > div.NavBar > div.NavBar--content > div > form > div:nth-child(3) > div.Filters__make-block > div:nth-child(2) > div.Filters__line.Filters__line--uppercase.Filters__line--make.Filters__line--icon.Filters__line--icon--close");
	}

	public String retornaVersaoCarro() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Filters__container > div.NavBar > div.NavBar--content > div > form > div:nth-child(3) > div.Filters__make-block > div:nth-child(2) > div.Filters__line.Filters__line--uppercase.Filters__line--strong.Filters__line--icon.Filters__line--icon--close");
	}

	public String retornaVerTodasVersoes() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Filters__container > div.NavBar > div.NavBar--content > div > form > div:nth-child(3) > div.Filters__make-block > div:nth-child(2) > div.Filters__line.Filters__line--icon.Filters__line--icon.Filters__line--icon--right.Filters__line--gray");
	}

	public String retornaDiv2() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(2)");
	}

	public String retornaDiv3() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(3)");
	}

	public String retornaDiv4() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(4)");
	}

	public String retornaDiv5() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(5)");
	}

	public String retornaDiv6() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(6)");
	}

	public String retornaDiv7() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(7)");
	}

	public String retornaDiv8() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(8)");
	}

	public String retornaDiv9() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(9)");
	}

	public String retornaDiv10() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(10)");
	}

	public String retornaDiv11() {
		return buscarTextoPorCss(
				"#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(11)");
	}

}
