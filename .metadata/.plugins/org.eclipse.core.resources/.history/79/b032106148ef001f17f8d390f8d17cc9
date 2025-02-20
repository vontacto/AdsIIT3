package com.bd.hospital2025.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.hospital2025.modelo.TblMedico;
import com.bd.hospital2025.repositorio.IMedicoRepositorio;

@Service
public class MedicoServicioImp implements IMedicoServicio{

	//Inyeccion de dependencia
	@Autowired
	private IMedicoRepositorio imedicorepositorio;
	
	@Override
	public void RegistrarMedico(TblMedico tblmedico) {
		//Metodo registrar
		imedicorepositorio.save(tblmedico);
	}

	@Override
	public void EliminarMedico(TblMedico tblmedico) {
		//Metodo eliminar
		imedicorepositorio.deleteById(tblmedico.getIdmedicot3());
		
	}

	@Override
	public List<TblMedico> ListadoMedicos() {
		//Metodo listar
		
		return (List<TblMedico>) imedicorepositorio.findAll();
	}

	@Override
	public TblMedico buscarporId(Integer id) {
		//Metodo Buscar
		return imedicorepositorio.findById(id).orElse(null);
	}

}
