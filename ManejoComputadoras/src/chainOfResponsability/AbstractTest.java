package chainOfResponsability;

import builder.BuilderComputadora;
	

public abstract class AbstractTest {
	   public static int inicial = 1;
	   public static int medio = 2;
	   public static int completo = 3;
	   protected int level;
	   protected AbstractTest nextTest;
	   public BuilderComputadora com;
	   
	
	   public void setNextTest(AbstractTest nextTest){
	      this.nextTest = nextTest;
	   }
	   
	  


   abstract protected void write(String message);
   abstract public boolean validador();
	}



