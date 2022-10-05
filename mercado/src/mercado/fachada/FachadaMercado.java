package mercado.fachada;

import java.util.Date;

import mercado.back.Lote;
import mercado.back.Produto;

public interface FachadaMercado {
	
	public Produto criaProduto(String nome, String fabricante, double preco);
	
	public Lote criaLote(int qtde, Date validade, Produto produto);
	
	public void listaProdutos();
	
	public void listaLotes();
}
