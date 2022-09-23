
public class MetodoSecante {
	
	public static void main(String[] args) {
	    encontraZeros(new Funcao() {
	      @Override
	      public double f(double x) {
	        return Math.pow(x, 6) + 3*Math.pow(x, 5) + 4*Math.pow(x, 3) - Math.pow(7, x);
	      }
	    });
	  }

	  public static interface Funcao{
	    public double f(double x);
	  }

	  public static void encontraZeros(Funcao f){
	    		  
		  double erro = 0.0001;
	    int contador = 0;
	    
	    
	    double x = 0.0;
	    
	    //Aproximações iniciais
	    double x0 = 2.0;    
	    double x1 = -2.0;
	   
	    double x2 = 0.0;

	    while(true){

	      if (Math.abs(f.f(x0)) <= erro){
	        x = x0;
	        System.out.println("O zero da função é: "+x);
	        System.out.println("O número de iterações: "+contador);
	        break;
	      }
	      
	      if (Math.abs(f.f(x1)) <= erro || Math.abs(x1-x0) <= erro){
	        x = x1;
	        System.out.println("O zero da função é: "+x);
	        System.out.println("O número de iterações: "+contador);
	        break;
	      }
	      contador++;

	      x2 = x1 - (f.f(x1)*(x1-x0)/(f.f(x1)-f.f(x0)));
	      
	      if (Math.abs(f.f(x2)) <= erro || Math.abs(x2-x1) <= erro){
	        x = x2;
	        System.out.println("O zero da função é: "+x);
	        System.out.println("O número de iterações: "+contador);
	        break;
	      }
	      
	      x0 = x1;
	      x1 = x2;

	      contador++;
	      
	    }
	  }

}
