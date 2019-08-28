package Interfaces;

import EntidadesComercial.Produto;

public interface ProdutoDAO {
	public void findAll();
	public Produto selectProd(Integer cod);
	public void deleteProd(Integer cod);
	public void insertProd(Produto prod);
	public void updateProd(Produto prod);
	
}
