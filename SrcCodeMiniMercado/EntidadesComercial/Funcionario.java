package EntidadesComercial;

import java.util.Date;

public class Funcionario {
	private Integer codFun;
	private String nomeFun;
	private String email;
	private Date dtNasc;
	private Departamento dep;
	
	public Funcionario(Integer codFun, String nomeFun, String email, Date dtNasc, Departamento dep) {
		super();
		this.codFun = codFun;
		this.nomeFun = nomeFun;
		this.email = email;
		this.dtNasc = dtNasc;
		this.dep = dep;
	}

	public Integer getCodFun() {
		return codFun;
	}

	public void setCodFun(Integer codFun) {
		this.codFun = codFun;
	}

	public String getNomeFun() {
		return nomeFun;
	}

	public void setNomeFun(String nomeFun) {
		this.nomeFun = nomeFun;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public Departamento getDep() {
		return dep;
	}

	public void setDep(Departamento dep) {
		this.dep = dep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codFun == null) ? 0 : codFun.hashCode());
		result = prime * result + ((dep == null) ? 0 : dep.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (codFun == null) {
			if (other.codFun != null)
				return false;
		} else if (!codFun.equals(other.codFun))
			return false;
		if (dep == null) {
			if (other.dep != null)
				return false;
		} else if (!dep.equals(other.dep))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [codFun=" + codFun + ", nomeFun=" + nomeFun + ", email=" + email + ", dtNasc=" + dtNasc
				+ ", dep=" + dep + "]";
	}
	
	
	
	
}
