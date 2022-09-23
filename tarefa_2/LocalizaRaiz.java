public class LocalizaRaiz {

	public static void main(String[] args) {
		
		System.out.println("1° Função:");
	      
        mostraTabela(new Funcao() {
            @Override
            public double f(double x) {
                return Math.pow(x, 6)+3*Math.pow(x, 5)+4*Math.pow(x, 3)-Math.pow(7, x);
            }
        }, new double[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10},0);

      System.out.println("2° Função:");
      
        mostraTabela(new Funcao() {
            @Override
            public double f(double x) {
                return 3/2 + Math.log10(x-1)-Math.pow(x, 5);
            }
        }, new double[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10},0);

      System.out.println("3° Função:");
      
        mostraTabela(new Funcao() {
            @Override
            public double f(double x) {
                return Math.sin(5*x)/Math.pow(x, 9) - 4*Math.cos(x);
            }
        }, new double[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10},0);

      System.out.println("4° Função:");
      
        mostraTabela(new Funcao() {
            @Override
            public double f(double x) {
                return Math.sqrt(Math.pow(x, 3)-8*Math.pow(x, -7));
            }
        }, new double[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10},0);

      System.out.println("5° Função:");
      
        mostraTabela(new Funcao() {
            @Override
            public double f(double x) {
                return Math.pow(3, x)- Math.log10(2*x-4);
            }
        }, new double[]{-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10},0);
    }

	
	public static void mostraTabela(Funcao f, double[] intervalo, double step){
	    
		double[] x;
	    if(intervalo.length > 2){
	        x=intervalo;
	    }else{
	        int len = (int) Math.floor((intervalo[1]-intervalo[0])/step);
	        x=new double[len];
	        double val = intervalo[0];
	        for(int i=0; i<len; i++){
	            x[i]= val;
	            val+=step;
	        }
	    }

	    for (double xi:x) {
	        System.out.println("x: "+xi+"  y: "+f.f(xi));
	    }
	}


	public static interface Funcao{
	    public double f(double x);
	}

}
