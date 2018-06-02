package com.globallogic.rds.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.globallogic.rds.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	public Student findByUserName(String userName);
	
	public List<Student> findBySubjects_id(Long id);
	

}
