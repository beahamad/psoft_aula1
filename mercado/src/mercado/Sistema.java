package mercado;

import java.util.Date;

public class Sistema {
	
	static Date d = new Date();

	public static void main(String[] args) {
		Produto p = new Produto("bike","caloi",700.00);
		Lote l = new Lote(50, d, p);

	}

}
