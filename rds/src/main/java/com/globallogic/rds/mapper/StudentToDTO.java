package com.globallogic.rds.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.globallogic.rds.api.model.UserType;
import com.globallogic.rds.domain.Student;

@Component
public class StudentToDTO implements Mapper<UserType, Student> {

	@Override
	public Student toModel(UserType dto) {
		Student s = new Student();
		BeanUtils.copyProperties(dto, s, "firstName", "id", "lastName","birthdate","phoneNumber","email","dni");
		return s;
	}

	@Override
	public UserType toDto(Student model) {
		UserType s = new UserType();

		BeanUtils.copyProperties(model, s, "firstName", "id", "lastName","birthdate","phoneNumber","email","dni");
		s.setId(""+model.getId());
		return s;
	}

}
