package Main;

import java.util.ArrayList;
import java.util.Scanner;

import EntidadesComercial.Produto;
import ServiçosComercial.TestaProdutoInsercao;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantidade de produtos a serem inseridos ?");
	int count = sc.nextInt();
	ArrayList<Produto> listProd = new ArrayList<Produto>();
	Produto p0 = new Produto(0,"Nao Alterar");
	listProd.add(p0);
	TestaProdutoInsercao testProdInsert = new TestaProdutoInsercao();
	
	for(int i =0;i<count;i++) {
		testProdInsert.validaInstanciaCriaProd(listProd);
	}
	
	
	sc.close();
	}

}	