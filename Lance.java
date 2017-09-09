package arrayList.leilao;

public class Lance {
	//Atributos
	private Pessoa licitante;
	private double valor;
	
	//Metodos Especiais
	public Lance(Pessoa licitante, double valor) {
		this.licitante = licitante;
		this.valor = valor;
	}
	
	public Pessoa getLicitante() {
		return licitante;
	}
	
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return ("Lance: " + licitante + " - R$ " + this.valor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Lance) ) return false;
		if ( this == obj )			   return true;
		
		Lance lance = (Lance) obj;
		return (licitante.equals(lance.licitante) && 
				valor == lance.valor);
	}
}
