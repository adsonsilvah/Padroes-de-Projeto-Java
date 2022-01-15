package Facade;

public class Volks implements Carro{

	@Override
    public void nome() {
        System.out.println("Gol");
    }
    @Override
    public void preco() {
        System.out.println("R$50000");
    }

}
