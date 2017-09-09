package arrayList.leilao;

public class Lote {
	//Atributos
	private int numero;
	private String descricao;
	private Lance maiorLance;
	
	public Lote(int numero, String descricao) {
		this.numero = numero;
		this.descricao = descricao;
	}
	
	public double getNumero() {
		return this.numero;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public Lance getMaiorLance() {
		return maiorLance;
	}
	
	public void lancePara(Pessoa licitante, double valor) {
		if (maiorLance == null || valor > maiorLance.getValor())
			maiorLance = new Lance(licitante, valor);
		else 
			System.out.println("Lance Inferior!\n" + "(" + maiorLance + ")");
	}
	
	@Override
	public String toString() {
		return ("Lote: " + numero + " - " + descricao + "\n" +
			    (maiorLance != null ? maiorLance : "Lance: Sem Lance"));
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Lote) ) return false;
		if ( this == obj )			  return true;
		
		Lote lote = (Lote) obj;
		return (numero == lote.numero && descricao.equalsIgnoreCase(lote.descricao)
				&& maiorLance.equals(lote.descricao));
	}
 }
