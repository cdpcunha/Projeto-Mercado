package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import EntidadesComercial.Produto;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	Scanner sc = new Scanner(System.in);
	ArrayList<Produto> listaProd = new ArrayList<Produto>();
	
	//Lista de arquivo -- Posterior acesso em banco relacional
	
	File arquivoProdutosEntrada = new File("C:\\Users\\Peixe\\Desktop\\Projeto Mini-Mercado\\Mini-Mercado\\arquivos\\Produtos.txt");
	
	try (BufferedReader br = new BufferedReader(new FileReader(arquivoProdutosEntrada))){
		String linha = br.readLine();
		String aux[] =linha.split(",");
		while(linha != null) {
			Produto prod = new Produto(Integer.parseInt(aux[0]), aux[1], Double.parseDouble(aux[2]), Integer.parseInt(aux[3]));
			listaProd.add(prod);
			linha = br.readLine();
		}
	}
	catch(IOException e) {
		System.out.println(e.getLocalizedMessage());
	}
	
	Menu.menuDisplay();
	int op = sc.nextInt();
	
	while(op != 0) {
		
	}
	sc.nextLine();
	
	
	
	
	sc.close();
	}
}	