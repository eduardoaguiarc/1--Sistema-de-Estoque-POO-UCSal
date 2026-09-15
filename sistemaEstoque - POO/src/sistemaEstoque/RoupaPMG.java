package sistemaEstoque;

import java.util.Scanner;

public class RoupaPMG implements Item {
	Scanner sc = new Scanner(System.in);

	String descrição;
	int quantidadeP;
	int quantidadeM;
	int quantidadeG;
	int estoqueMinimo;
	int estoqueMaximo;

	public RoupaPMG( String descrição, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
			int estoqueMaximo) {
	
		
		this.descrição = descrição;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public int venda() {
		int subPeça = 0;
		String tamanho;
		boolean escolha = false;

		while (escolha) {

			System.out.println("Qual tamanho do item?");
			tamanho = sc.next();

			if (tamanho == "G") {
				subPeça = quantidadeP - 1;
				System.out.println(" Tamanho de peça escolhida : G");
			} else if (tamanho == "M") {
				subPeça = quantidadeM - 1;
				System.out.println(" Tamanho de peça escolhida : M");
			} else if (tamanho == "P") {
				subPeça = quantidadeP - 1;
				System.out.println(" Tamanho de peça escolhida : P");
			} else {
				System.out.println("Tamanho não identificado");
				continue;
			}
			escolha = (!escolha);
		}

		return subPeça;

	}

	public void reposiçãoEstoque() {

		if (quantidadeP < estoqueMinimo) {quantidadeP = estoqueMaximo;
		
		} else if (quantidadeM < estoqueMinimo) {quantidadeM = estoqueMaximo;

		} else if (quantidadeG < estoqueMinimo) {quantidadeG = estoqueMaximo;}
	}
}
