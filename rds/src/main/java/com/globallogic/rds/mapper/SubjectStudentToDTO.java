package com.globallogic.rds.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.globallogic.rds.api.model.AlumnoMateriaType;
import com.globallogic.rds.domain.Subject;

@Component
public class SubjectStudentToDTO implements Mapper<AlumnoMateriaType, Subject> {

	@Override
	public Subject toModel(AlumnoMateriaType dto) {
		Subject s = new Subject();
		BeanUtils.copyProperties(dto, s, "nombre", "id", "grado","horario","fecha");
		return s;
	}

	@Override
	public AlumnoMateriaType toDto(Subject model) {
		AlumnoMateriaType s = new AlumnoMateriaType();
		BeanUtils.copyProperties(model, s, "nombre", "id", "grado","horario","fecha");
		s.setFecha(model.getFecha());
		s.setGrado(model.getGrado());
		s.setHorario(model.getHorario());
		s.setInscripto(true);
		s.setNombre(model.getNombre());
		s.setId(""+model.getId());
		return s;
	}

}
