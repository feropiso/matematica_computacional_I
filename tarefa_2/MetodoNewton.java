

public class MetodoNewton {
	
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
		    
		    int contador = 0;
		    //Aproximação
		    double x0 = -1.0;
		    
		    double x = 0.0;
		    double x1 = 0.0;
		    double erro = 0.0001;
		    
		    while(true){

		      if (Math.abs(f.f(x0)) <= erro){
		        x = x0;
		        System.out.println("O zero da função é: "+x);
		        System.out.println("O número de iterações: "+contador);
		        break;
		      }
		      contador++;

		      x1 = x0 - f.f(x0)/(6*Math.pow(x0, 5) + 15*Math.pow(x0, 4) + 12*Math.pow(x0, 2) - Math.log10(7)*Math.pow(7, x0));

		      if (Math.abs(f.f(x1)) <= erro || Math.abs(x1-x0) <= erro){
		        x = x1;
		        System.out.println("O zero da função é: "+x);
		        System.out.println("O número de iterações: "+contador);
		        break;
		      }

		      x0 = x1;
		      
		      contador++;
		      
		    }    
		  }

}

