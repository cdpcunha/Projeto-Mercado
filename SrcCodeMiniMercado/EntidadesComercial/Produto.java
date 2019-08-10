package EntidadesComercial;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
	private Integer codProd;
	private String nomeProd;
	private Double precoProd;
	private Integer qtdEstoque;
	
	public Produto(Integer codProd, String nomeProd) {
		super();
		this.codProd = codProd;
		this.nomeProd = nomeProd;
	}
	
	public boolean comparaProd (Produto prod) {
		if(prod.getCodProd() == this.getCodProd()) {
			return true;
		}
		else return false;
	}
		
	public Integer getCodProd() {
		return codProd;
	}

	public void setCodProd(Integer codProd) {
		this.codProd = codProd;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public Double getPrecoProd() {
		return precoProd;
	}

	public void setPrecoProd(Double precoProd) {
		this.precoProd = precoProd;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	@Override
	public String toString() {
		return "Produto [codProd=" + codProd + ", nomeProd=" + nomeProd + ", precoProd=" + precoProd + ", qtdEstoque="
				+ qtdEstoque + "]";
	}
	
	
}
