package mercado.fachada;

import java.util.Map;

import mercado.back.Lote;
import mercado.back.Produto;

public interface FachadaRepositorio {
	
	public void addProduto(Produto p);
	
	public boolean removeProduto(String id);
	
	public void addLote(Lote l);
	
	public boolean removeLote(String id);
	
	public Map<String,Produto> getListaProdutos();
	
	public Map<String,Lote> getListaLotes();	

}
