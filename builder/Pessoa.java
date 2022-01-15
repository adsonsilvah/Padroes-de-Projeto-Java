package builder;

public class Pessoa {

	    private String nome;
	    private int idade;
	    private int telefone;
	    private String municipio;
	    private String Estado;
	    
	        private Pessoa(PessoaBuilder builder) {
	        this.nome = builder.nome;
	        this.idade = builder.idade;
	        this.telefone = builder.telefone;
	        this.municipio = builder.municipio;
	        this.Estado = builder.Estado;
	}

	    public String getNome() {
	        return nome;
	}
	    
	    public int getIdade() {
	        return idade;
	}
	    
	    public int getTelefone() {
	        return telefone;
	}
	    public String getmunicipio() {
	        return municipio;
	    }
	    public String getEstado() {
	        return Estado;
	    }
	    
	public static class PessoaBuilder{
	    
	    private final String nome;
	    private int idade;
	    private int telefone;
	    private String municipio;
	    private String Estado;
	    
	    
	    public PessoaBuilder(String nome) {
	        this.nome = nome;
	}
	    public PessoaBuilder idade(int idade) {
	        this.idade = idade;
	        return this;
	}
	    public PessoaBuilder telefone(int telefone) {
	        this.telefone = telefone;
	        return this;
	}
	    public PessoaBuilder municipio (String municipio) {
	        this.municipio = municipio;
	        return this;
	    }
	    public PessoaBuilder Estado (String Estado) {
	        this.Estado = Estado;
	        return this;
	    }
	    
	    public Pessoa build() {
	        Pessoa pessoa =  new Pessoa(this);
	        return pessoa;
	}
	    
	}

	@Override
	public String toString() {
	    return "Pessoa: "+this.nome+", "+this.idade+", "+this.telefone+", "+this.municipio+", "+this.Estado;
	}

	}


