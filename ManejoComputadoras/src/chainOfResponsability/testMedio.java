package chainOfResponsability;

public class testMedio extends AbstractTest {
	public testMedio(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Mensaje: " + message);
	   }
	   
	   public boolean validador() {
		   if(this.com.getComputador().getModelo()=="ROG" && this.com.getComputador().getAlmacenamiento()==1000) {
			   this.write("Test medio completado");	
			   return true;
		   }else
			   this.write("error en test medio");
			   return false;
	   }
			   
}

