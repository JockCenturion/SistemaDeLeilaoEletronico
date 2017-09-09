package arrayList.leilao;

public class Pessoa {
	//Atributos
	private String nome;
	
	//Metodos Especiais
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return (this.nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Pessoa) ) return false;
		if ( this == obj )				return true;
		
		Pessoa pessoa = (Pessoa) obj;
		return (nome.equalsIgnoreCase(pessoa.nome));
	}
	

}
