package Facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Concessionaria {

	  private static int escolha;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		do {
            System.out.println("Bem vido(a) a concessionária, escolha seu carro:");
            System.out.println("1 - Siena");
            System.out.println("2 - Gol");
            System.out.println("3 - Civic");
            System.out.println("4 - Sair");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            escolha = Integer.parseInt(br.readLine());
            CarrosLoja carros = new CarrosLoja();
            
            
            switch(escolha){
                
            case 1:{
                carros.VendaFiat();
                
            }
            break;
            case 2: {
                carros.VendaVolks();
            }
            break;
            case 3: {
                carros.VendaHonda();
            }
            break;
            
            default:{
                System.out.println("Nenhum carro comprado");
            }
            return;
            }
        }while(escolha!=4);

	}

}
