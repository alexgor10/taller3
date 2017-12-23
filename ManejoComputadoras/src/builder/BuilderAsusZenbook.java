package builder;

import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class BuilderAsusZenbook extends BuilderComputadora{

	@Override
	public void definirMarca() {
		computador.setMarca("Asus");
	}

	@Override
	public void definirModelo() {
		computador.setModelo("Zenbook");
	}

	@Override
	public void definirRAM() {
		computador.setRam(16);	
		
	}

	@Override
	public void definirAlmacenamiento() {
		computador.setAlmacenamiento(500);
		
	}

	@Override
	public void definirSO() {
		computador.setOs(new SistemaOperativo("Windows 10", 64, "Home"));
		
	}

	@Override
	public void definirMainboard() {
		computador.setPlaca(new Mainboard("Prime", "Z370"));
		
	}
	
	@Override
	public void definirComputador() {
		computador = new Computador();
		
	}
}
