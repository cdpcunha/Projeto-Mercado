package ServiçosComercial;

import java.util.ArrayList;
import java.util.Scanner;

import EntidadesComercial.Produto;

//Testa se o produto ja existe na lista e o insere em tal lista ao final
public class TestaProdutoInsercao {

	public ArrayList<Produto> cadastroProd(ArrayList<Produto> listProd) {
		Scanner sc = new Scanner(System.in);
		System.out.println("  Digite os dados do produto a ser instanciado  ");
		System.out.print("Código do Produto : ");
		Integer codProd = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do Produto  : ");
		String nomeProd = sc.nextLine();
		sc.nextLine();
		
		if (this.testaLista(listProd, codProd)) {
			Produto produto = new Produto(codProd, nomeProd);
			listProd.add(produto);
		}
		System.out.println("Produto Inserido com Sucesso.");
		sc.close();
		return listProd;
	}

	public boolean testaLista(ArrayList<Produto> listProd, Integer codProd) {
		for (Produto p : listProd) {
			if (p.getCodProd() == codProd) {
				System.out.println("Código do Produto ja existe.");
				break;
			} else {
			}
		}
		return true;
	}
}
