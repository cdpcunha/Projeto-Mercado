package ServiçosComercial;

import java.util.ArrayList;
import java.util.Scanner;

import EntidadesComercial.Produto;

public class TestaProdutoInsercao{
	
	public void validaInstanciaCriaProd (ArrayList<Produto> listProd) {
		Scanner sc = new Scanner(System.in);
		System.out.println("  Digite os dados do produto a ser instanciado  ");
		System.out.print("Código do Produto : ");
		Integer codProd = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do Produto  : ");
		String nomeProd = sc.nextLine();
		for(Produto p : listProd) {
			if(p.getCodProd() == codProd) {
				System.out.println("Código do Produto ja existe.");
			}
			else {
				Produto produto = new Produto(codProd,nomeProd);
				listProd.add(produto);
				System.out.println("Produto inserido com sucesso");
			}
		}
		sc.close();
	}
}
