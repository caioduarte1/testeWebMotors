package testeWebMotors.TESTE;

import org.junit.Assert;
import org.junit.Test;

import testeWebMotors.PAGE.ConsultarCarroPAGE;

public class ConsultarCarroTEST {

	ConsultarCarroPAGE cc = new ConsultarCarroPAGE();

	@Test
	public void consultarModeloHondaVersaoCity() throws InterruptedException {
		cc.acessarUrlWebMotors();
		String carro = "HONDA CITY";
		cc.inserirNome(carro);
		cc.espearPor1s();
		cc.clicarBusca();
		cc.espearPor2s();
		Assert.assertEquals("Marca do carro", cc.retornaMarcaCarro());
		Assert.assertEquals("HONDA", cc.retornaModeloCarro());
		Assert.assertEquals("CITY", cc.retornaVersaoCarro());
		Assert.assertEquals("Todas as versões", cc.retornaVerTodasVersoes());
		cc.clicarVerVersoes();
		cc.espearPor1s();
		Assert.assertEquals("1.5 DX 16V FLEX 4P AUTOMÁTICO", cc.retornaDiv2());
		Assert.assertEquals("1.5 DX 16V FLEX 4P MANUAL", cc.retornaDiv3());
		Assert.assertEquals("1.5 EX 16V FLEX 4P AUTOMÁTICO", cc.retornaDiv4());
		Assert.assertEquals("1.5 EX 16V FLEX 4P MANUAL", cc.retornaDiv5());
		Assert.assertEquals("1.5 EXL 16V FLEX 4P AUTOMÁTICO", cc.retornaDiv6());
		Assert.assertEquals("1.5 EXL 16V FLEX 4P MANUAL", cc.retornaDiv7());
		Assert.assertEquals("1.5 LX 16V FLEX 4P AUTOMÁTICO", cc.retornaDiv8());
		Assert.assertEquals("1.5 LX 16V FLEX 4P MANUAL", cc.retornaDiv9());
		Assert.assertEquals("1.5 PERSONAL 16V FLEX 4P AUTOMÁTICO", cc.retornaDiv10());
		Assert.assertEquals("1.5 SPORT 16V FLEX 4P MANUAL", cc.retornaDiv11());

	}

}
