package builder;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa1 = new Pessoa.PessoaBuilder("Mateus")
                .idade(19)
                .telefone(1234567)
                .municipio("Canhotinho")
                .Estado("Pernambuco")
                .build();

        
        Pessoa pessoa2 = new Pessoa.PessoaBuilder("João")
                .idade(30)
                .telefone(034521)
                .municipio("Máceio")
                .Estado("Alagoas")
                .build();
        
        

        Pessoa pessoa3 = new Pessoa.PessoaBuilder("Maria")
                .idade(50)
                .telefone(122098)
                .municipio("Garanhuns")
                .Estado("Pernanmbuco")
                .build();

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

	}

}
