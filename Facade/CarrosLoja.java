package Facade;

public class CarrosLoja {

	 private Carro Fiat;
	    private Carro Honda;
	    private Carro Volks;
	    
	    public CarrosLoja() {
	        Fiat = new Fiat();
	        Honda = new Honda();
	        Volks = new Volks();
	    }
	    
	    public void VendaFiat() {
	        Fiat.nome();
	        Fiat.preco();
	        
	    }
	    
	    public void VendaHonda() {
	        Honda.nome();
	        Honda.preco();
	    }
	    
	    public void VendaVolks() {
	        Volks.nome();
	        Volks.preco();
	    }

}
