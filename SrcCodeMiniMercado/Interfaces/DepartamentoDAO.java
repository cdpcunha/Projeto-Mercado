package Interfaces;

import EntidadesComercial.Departamento;

public interface DepartamentoDAO {
	public void findAll();
	public Departamento selectDep(Integer cod);
	public void deleteProd(Integer cod);
	public void insertProd(Departamento dep);
	public void updateProd(Departamento dep);
}
