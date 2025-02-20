package com.bd.hospital2025.servicio;

import java.util.List;

import com.bd.hospital2025.modelo.TblMedico;

public interface IMedicoServicio {
	//declaracion de metodos
	void RegistrarMedico(TblMedico tblmedico);
	void EliminarMedico(TblMedico tblmedico);
	List<TblMedico> ListadoMedicos();
	TblMedico buscarporId(Integer id);
	
}
