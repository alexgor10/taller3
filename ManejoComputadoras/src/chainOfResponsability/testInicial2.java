package chainOfResponsability;

public class testInicial2 extends AbstractTest {
	public testInicial2(int level){
	      this.level = level;
	   }
	
	   @Override
	   protected void write(String message) {		
	      System.out.println("Mensaje: " + message);
	   }
	   
	   public boolean validador() {
		   if(this.com.getComputador().getMarca()=="ASUS" && this.com.getComputador().getOs().getNombre()=="Windows 10" && this.com.getComputador().getOs().getVersion()=="Home" && this.com.getComputador().getOs().getArquitectura()==64) {
			   this.write("Test inicial completado");
			   return true;
		   }else
			   this.write("Error en test inicial");
			   return false;
	   }
}
