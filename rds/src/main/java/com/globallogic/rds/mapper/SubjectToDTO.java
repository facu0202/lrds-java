package com.globallogic.rds.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.globallogic.rds.api.model.MateriaType;
import com.globallogic.rds.domain.Subject;

@Component
public class SubjectToDTO implements Mapper<MateriaType, Subject> {

	@Override
	public Subject toModel(MateriaType dto) {
		Subject s = new Subject();
		BeanUtils.copyProperties(dto, s, "nombre", "id", "grado","horario","fecha");
		return s;
	}

	@Override
	public MateriaType toDto(Subject model) {
		MateriaType s = new MateriaType();
		BeanUtils.copyProperties(model, s, "nombre", "id", "grado","horario","fecha");
		s.setId(""+model.getId());
		return s;
	}

}
