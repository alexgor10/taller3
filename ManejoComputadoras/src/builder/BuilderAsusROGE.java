package builder;

import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class BuilderAsusROGE extends BuilderComputadora{

	@Override
	public void definirMarca() {
		computador.setMarca("Asus");
	}

	@Override
	public void definirModelo() {
		computador.setModelo("ROG");
	}

	@Override
	public void definirRAM() {
		computador.setRam(32);	
		
	}

	@Override
	public void definirAlmacenamiento() {
		computador.setAlmacenamiento(1000);
		
	}

	@Override
	public void definirSO() {
		computador.setOs(new SistemaOperativo("Windows 10", 64, "PRO"));
		
	}

	@Override
	public void definirMainboard() {
		computador.setPlaca(new Mainboard("Strix", "x99"));
		
	}

	@Override
	public void definirComputador() {
		computador = new Computador();
		
	}
}
