package sistemaEstoque;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {
	Scanner sc = new Scanner(System.in);

	public Acessorio(String descrição, int qntdEstoque, int minEstoque, int maxEstoque) {
		super(descrição, qntdEstoque, minEstoque, maxEstoque);
	}

	@Override
	public void Venda() {
		int vendido = 0;
		System.out.println("Quantos Acessorios foram vendidos?");
		vendido = sc.nextInt();
		qntdEstoque -= vendido;
		
	}

}
