package sistemaEstoque;

public class APP {

	public static void main(String[] args) {
		Item[] estoque = new Item[5];

		// Acessorio (descricao, qntdEstoque, minEstoque, maxEstoque)
        estoque[0] = new Acessorio("Cinto Casual", 15, 5, 30); 

        // RoupaTamanhoUnico (descricao, qntdEstoque, minEstoque, maxEstoque)
        estoque[1] = new RoupaTamanhoUnico("Cachecol Lã", 10, 3, 20); 

        // RoupaPMG (descricao, qtdP, qtdM, qtdG, minEstoque, maxEstoque)
        estoque[2] = new RoupaPMG("Camiseta Listrada", 2, 5, 15,5,5); 

        // Acessorio (descricao, qntdEstoque, minEstoque, maxEstoque)
        estoque[3] = new Acessorio("Pulseira Dourada", 30, 10, 50);

        // RoupaPMG (descricao, qtdP, qtdM, qtdG, minEstoque, maxEstoque)
        estoque[4] = new RoupaPMG("Calça de Moletom", 3, 6, 9, 3, 12);
    }

}
