package chainOfResponsability;

public class testMedio2 extends AbstractTest {
	public testMedio2(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Mensaje: " + message);
	   }
	   
	   public boolean validador() {
		   if(this.com.getComputador().getModelo()=="Zenbook" && this.com.getComputador().getAlmacenamiento()==500) {
			   this.write("Test medio completado");	
			   return true;
		   }else
			   this.write("error en test medio");
			   return false;
	   }
			   
}
