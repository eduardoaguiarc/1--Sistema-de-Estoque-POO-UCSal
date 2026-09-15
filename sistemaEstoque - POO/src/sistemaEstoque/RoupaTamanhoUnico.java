package sistemaEstoque;

public class RoupaTamanhoUnico extends Peca implements Item {

	public RoupaTamanhoUnico(String descrição, int qntdEstoque, int minEstoque, int maxEstoque) {
		super(descrição, qntdEstoque, minEstoque, maxEstoque);
	}

	@Override
	public void Venda() {
		if (qntdEstoque > 0) {
			qntdEstoque--;
		}
	}

}
