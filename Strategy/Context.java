package Strategy;

public class Context {

	  private Calculadora calculadora;
	    
	    public Context(Calculadora calculadora) {
	        this.calculadora= calculadora;
	    }
	    
	    public int ExecutaCalculadora(int numero1, int numero2) {
	        return calculadora.numeros(numero1, numero2);
	    }

}
