package sistemaEstoque;

public abstract class Peca {

	protected String descrição;
	protected int qntdEstoque;
	protected int minEstoque;
	protected int maxEstoque;

	public Peca(String descrição, int qntdEstoque, int minEstoque, int maxEstoque) {
		super();
		this.descrição = descrição;
		this.qntdEstoque = qntdEstoque;
		this.minEstoque = minEstoque;
		this.maxEstoque = maxEstoque;
	}

	abstract void Venda();

	protected int reposiçãoEstoque(int minEstoque, int qntdEstoque, int maxEstoque) {

		if (qntdEstoque < minEstoque) {
			qntdEstoque = maxEstoque;
		}

		return qntdEstoque;
	}

	public int getQntdEstoque() {
		return qntdEstoque;
	}

	public void setQntdEstoque(int qntdEstoque) {
		this.qntdEstoque = qntdEstoque;
	}

	public int getMinEstoque() {
		return minEstoque;
	}

	public void setMinEstoque(int minEstoque) {
		this.minEstoque = minEstoque;
	}

	public int getMaxEstoque() {
		return maxEstoque;
	}

	public void setMaxEstoque(int maxEstoque) {
		this.maxEstoque = maxEstoque;
	}
}
