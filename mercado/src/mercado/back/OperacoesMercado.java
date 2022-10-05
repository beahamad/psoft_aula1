package mercado.back;

import java.util.Date;

import mercado.fachada.FachadaMercado;

public class OperacoesMercado implements FachadaMercado {

	@Override
	public Produto criaProduto(String nome, String fabricante, double preco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lote criaLote(int qtde, Date validade, Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listaProdutos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listaLotes() {
		// TODO Auto-generated method stub

	}

}
