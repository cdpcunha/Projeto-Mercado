package EntidadesComercial;

public class Departamento {
	private Integer codDep;
	private String nomeDep;
	
	public Departamento(Integer codDep, String nomeDep) {
		super();
		this.codDep = codDep;
		this.nomeDep = nomeDep;
	}

	public Integer getCodDep() {
		return codDep;
	}

	public void setCodDep(Integer codDep) {
		this.codDep = codDep;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codDep == null) ? 0 : codDep.hashCode());
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
		Departamento other = (Departamento) obj;
		if (codDep == null) {
			if (other.codDep != null)
				return false;
		} else if (!codDep.equals(other.codDep))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departamento [codDep=" + codDep + ", nomeDep=" + nomeDep + "]";
	}
	
	
}
