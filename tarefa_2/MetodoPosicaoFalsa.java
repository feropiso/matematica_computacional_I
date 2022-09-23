
public class MetodoPosicaoFalsa {

	public static void main(String[] args) {
		 encontraZeros(new Funcao() {
			 @Override
			 public double f(double x) {
				 return Math.pow(x, 6) + 3*Math.pow(x, 5)+4*Math.pow(x, 3)-Math.pow(7, x);
		     }
		 });

	}
	
	public static interface Funcao{
		public double f(double x);
	}

	public static void encontraZeros(Funcao f){

	    int contador = 0;
	    double m = 0.0;
	    double x = 0.0;
	    //intervalos
	    double a = -2.0;
	    double b = 2.0;
	    double erro = 0.0001;
	      
	    while(true){

	      if (b - a <= erro){
	        x = a;
	        System.out.println("O zero da funcao e: "+x);
	        System.out.println("O numero de iteracoes: "+contador);
	        break;
	      }
	      
	      contador++;
	      
	      if (Math.abs(f.f(a)) <= erro || Math.abs(f.f(b)) <= erro)      {
	        x = a;
	        System.out.println("O zero da funcao e: "+x);
	        System.out.println("O numero de iteracoes: "+contador);
	        break;
	      }

	      m = f.f(a);

	      x = (a*f.f(b) - b*f.f(a))/(f.f(b) - f.f(a));	      
	      
	      if (Math.abs(f.f(x)) <= erro){
	        System.out.println("O zero da funcao e: "+x);
	        System.out.println("O numero de iteracoes: "+contador);
	        break;        
	      }
	      
	      b = x;
	      
	      if (m > 0){
	        a = x;
	        if (b - a <= erro){ 
	          b = b + 0.001;
	          System.out.println("O zero da funcao e: "+b);
	          System.out.println("O numero de iteracoes: "+contador);
	          break;
	        }
	      }
	           
	      contador++;    
	    }
	          
	 }

}
