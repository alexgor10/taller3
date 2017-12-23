package main;

import builder.BuilderAsusROGE;
import builder.BuilderAsusZenbook;
import builder.ComputadorDirector;
import emsamablajecomputadoras.creacional.Computador;

public class Main {

	public static void main(String[] args) {
		ComputadorDirector creador = new ComputadorDirector(new BuilderAsusROGE());
		creador.EnsamblarComputadora();
		creador.verificarComputadorRoge();
		Computador comp = creador.getComputador();
		String especificacion = comp.especificacionesTecnicas();
		System.out.println(especificacion);
		
		
		
		
	}

}
