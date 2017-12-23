package builder;

import emsamablajecomputadoras.creacional.Computador;

public abstract class BuilderComputadora {
	protected Computador computador;
	
	public Computador getComputador() {
		return computador;
	}
	
	public abstract void definirComputador();
	public abstract void definirMarca();
	public abstract void definirModelo();
	public abstract void definirRAM();
	public abstract void definirAlmacenamiento();
	public abstract void definirSO();
	public abstract void definirMainboard();	
}
