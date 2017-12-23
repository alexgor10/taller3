package chainOfResponsability;

public class testFinal2 extends AbstractTest {
	public testFinal2(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Mensaje: " + message);
	   }
	   
	   public boolean validador() {
		   if(this.com.getComputador().getPlaca().getModelo()=="Prime" && this.com.getComputador().getPlaca().getModelo()=="Z370" && this.com.getComputador().getRam()==16) {
			   this.write("Test final completado");
			   return true;
		   }else
			   this.write("Error en test final");
			   return false;
	   }
}