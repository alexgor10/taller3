package decorator;


public class AsusZenbookGamer extends ComputadorDecorator {
	
	@Override
	public String especificacionesTecnicas() {
		computador.setRam(computador.getRam()+16);
		return "Computador Gamer /n"+computador.especificacionesTecnicas();
	}
	
}