package chainOfResponsability;

public class testFinal extends AbstractTest {
	public testFinal(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Mensaje: " + message);
	   }
	   
	   public boolean validador() {
		   if(this.com.getComputador().getPlaca().getModelo()=="Strix" && this.com.getComputador().getPlaca().getModelo()=="x99" && this.com.getComputador().getRam()==32) {
			   this.write("Test final completado");
			   return true;
		   }else
			   this.write("Error en test final");
			   return false;
	   }
}