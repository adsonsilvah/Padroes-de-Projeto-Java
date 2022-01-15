package Facade;

public class Fiat implements Carro {

	@Override
    public void nome() {
        System.out.println("Siena");
    }
    @Override
    public void preco() {
        System.out.println("R$30000");
    }

}
