package mercado.fachada;

import mercado.back.Lote;
import mercado.back.Produto;

public interface FachadaMercado {
	
	public Produto criaProduto();
	
	public Lote criaLote();
	
	public void listaProdutos();
	
	public void listaLotes();
}
