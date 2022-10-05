package mercado.repositorio;

import java.util.HashMap;
import java.util.Map;

import mercado.back.Lote;
import mercado.back.Produto;
import mercado.fachada.FachadaRepositorio;

public class RepositorioMercado implements FachadaRepositorio{
	
	private Map<String,Produto> produtos = new HashMap<String, Produto>();
	private Map<String,Lote> lotes = new HashMap<String, Lote>();
	
	@Override
	public void addProduto(Produto p) {
		this.produtos.put(p.getNome(), p);
	}

	@Override
	public boolean removeProduto(String id) {
		boolean ok = this.produtos.containsKey(id);
		if (ok){
			this.produtos.remove(id);
		}
		return ok;
	}

	@Override
	public void addLote(Lote l) {
		this.lotes.put("fon", l);
		
	}

	@Override
	public boolean removeLote(String id) {
		boolean ok = this.lotes.containsKey(id);
		if (ok){
			this.lotes.remove(id);
		}
		return ok;
	}

	@Override
	public Map<String,Produto> getListaProdutos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String,Lote> getListaLotes() {
		// TODO Auto-generated method stub
		return null;
	}

}
