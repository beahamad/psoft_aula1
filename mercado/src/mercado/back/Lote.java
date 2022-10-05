package mercado.back;

import java.util.Date;

public class Lote {
	
	private int qtde;
	private Date validade;
	private Produto produto;
	
	public Lote(int qtde, Date validade, Produto produto) {
		super();
		this.qtde = qtde;
		this.validade = validade;
		this.produto = produto;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
