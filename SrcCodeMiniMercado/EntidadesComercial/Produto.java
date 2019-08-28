package EntidadesComercial;

public class Produto {
	private Integer codProd;
	private String nomeProd;
	private String Marca;
	private Double preco;
	private Integer qtdEst;

	public Produto() {
		super();
	}

	public Produto(Integer codProd, String nomeProd, String marca) {
		super();
		this.codProd = codProd;
		this.nomeProd = nomeProd;
		Marca = marca;
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

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQtdEst() {
		return qtdEst;
	}

	public void setQtdEst(Integer qtdEst) {
		this.qtdEst = qtdEst;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codProd == null) ? 0 : codProd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codProd == null) {
			if (other.codProd != null)
				return false;
		} else if (!codProd.equals(other.codProd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [codProd=" + codProd + ", nomeProd=" + nomeProd + ", Marca=" + Marca + ", preco=" + preco
				+ ", qtdEst=" + qtdEst + "]";
	}		
	
	
}
