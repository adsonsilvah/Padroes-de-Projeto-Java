package Strategy;

public class ResultadosCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context context = new Context(new Soma());    
        System.out.println("4 + 4  = " + context.ExecutaCalculadora(4, 4));

        context = new Context(new subtracao());        
        System.out.println("10 - 5 = " + context.ExecutaCalculadora(10, 5));

        context = new Context(new multiplica());        
        System.out.println("9 * 9 = " + context.ExecutaCalculadora(9, 9));
        
        context = new Context(new Divisao());        
        System.out.println(" 20 / 4 = " + context.ExecutaCalculadora(20, 4));
	}

}
