package arrayList.leilao;

import java.util.ArrayList;
import java.util.Iterator;

public class Leilao {
	//Atributos
	private ArrayList<Lote> leilao;
	
	//Metodos Especiais
	public Leilao() {
		leilao = new ArrayList<>();
	}
	
	public void addLote(String descricao) {
		if (leilao.contains(null)) {
			int indice = leilao.indexOf(null);
			leilao.set(indice, new Lote(indice + 1, descricao));
		} else {
			leilao.add(new Lote(leilao.size() + 1, descricao));
		}	
	}
	
	public Lote removeLote(int numero) {
		Lote lote  = leilao.remove(numero - 1);	
		leilao.add(numero - 1, null);			
		return lote;
	}
	
	public Lote getLote(int indice) {
		return (indice >= 1 && indice <= leilao.size() ? leilao.get(indice - 1) : null);
	}
	
	public int quantidadeDeLotes() {
		return leilao.size();
	}
	
	public void listaLotes() {
		Iterator<Lote> it = leilao.iterator();
		while (it.hasNext()) {
			Lote lote = it.next();
			System.out.println( lote == null ? "Removido\n" : lote + "\n");
		}
	}
	
	public ArrayList<Lote> getNaoVendidos() {
		ArrayList<Lote> naoVendidos = new ArrayList<>();
		
		for (Lote lote : leilao) 
			if (lote.getMaiorLance() == null)
				naoVendidos.add(lote);
		
		return (naoVendidos.size() > 0 ? naoVendidos : null);
	}
	
}



