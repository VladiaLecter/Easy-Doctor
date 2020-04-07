package com.generationc20.EasyDoctor.Service;

import java.util.List;
import java.util.Optional;

import com.generationc20.EasyDoctor.model.HistorialClinico;
import com.generationc20.EasyDoctor.model.HistorialFamiliar;
import com.generationc20.EasyDoctor.model.HistorialNoClinico;
import com.generationc20.EasyDoctor.model.HistorialSexual;
import com.generationc20.EasyDoctor.model.Paciente;

public interface PacienteService {
	
	Paciente crearPaciente(Paciente paciente);
	List<Paciente> getAll();
	HistorialClinico crearhC(Integer idPaciente,HistorialClinico hC);
	HistorialFamiliar crearhF(Integer idPaciente,HistorialFamiliar hF);
	HistorialNoClinico crearhNC(Integer idPaciente,HistorialNoClinico hNC);
	HistorialSexual crearhS(Integer idPaciente,HistorialSexual hS);
	Optional<Paciente> getById(Integer id);
	Paciente updata(Integer id,Paciente paciente);
	void delate(Integer id);
	

}
