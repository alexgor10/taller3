package builder;


import emsamablajecomputadoras.creacional.Computador;
import chainOfResponsability.AbstractTest;
import chainOfResponsability.testFinal;
import chainOfResponsability.testFinal2;
import chainOfResponsability.testInicial;
import chainOfResponsability.testInicial2;
import chainOfResponsability.testMedio;
import chainOfResponsability.testMedio2;

public class ComputadorDirector {
	private BuilderComputadora builder;

	public ComputadorDirector(BuilderComputadora builder) {
		this.builder = builder;
	}
	
	public void EnsamblarComputadora() {
		builder.definirComputador();
		builder.definirMarca();
		builder.definirModelo();
		builder.definirRAM();
		builder.definirAlmacenamiento();
		builder.definirSO();
		builder.definirMainboard();
	}
	
	public static AbstractTest verificarComputadorRoge() {
		AbstractTest inicialRoge = new testInicial(AbstractTest.inicial);
		AbstractTest medioRoge = new testMedio(AbstractTest.medio);
		AbstractTest finalRoge = new testFinal(AbstractTest.completo);
		
		inicialRoge.setNextTest(medioRoge);
		medioRoge.setNextTest(finalRoge);
		
		return inicialRoge;
	}
	
	public static AbstractTest verificarComputadorZenbook() {
		AbstractTest inicialZenbook = new testInicial2(AbstractTest.inicial);
		AbstractTest medioZenbook = new testMedio2(AbstractTest.medio);
		AbstractTest finalZenbook = new testFinal2(AbstractTest.completo);
		
		inicialZenbook.setNextTest(medioZenbook);
		medioZenbook.setNextTest(finalZenbook);
		
		return inicialZenbook;	
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
