package com.globallogic.rds.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.rds.domain.Student;
import com.globallogic.rds.domain.Subject;
import com.globallogic.rds.exception.RutaDelSoftwareException;
import com.globallogic.rds.repository.StudentRepository;
import com.globallogic.rds.repository.SubjectRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	public Student login(String userName, String pass )
	{
		
		Student student = studentRepository.findByUserName(userName);
		if (student.getPassword().equals(pass))
			return student;
		return null; 
	}
	
	public void changeSubject (Long idUser, Long idSubjet) throws RutaDelSoftwareException
	{
		Optional<Student> st = studentRepository.findById(idUser);
		Optional<Subject> subject = subjectRepository.findById(idSubjet);
		if (!st.isPresent())
			throw new RutaDelSoftwareException("No existe el alumnos");
		if (!subject.isPresent())
			throw new RutaDelSoftwareException("No existe la materia");
		
		Student student = st.get();
		student.getSubjects().add(subject.get());
		studentRepository.save(student);
		
		
	}
	public List<Student> findBySubject(Long id)
	{
		return studentRepository.findBySubjects_id(id);
	}
	
	
	
	public Student find(String userName )
	{
		Student student = studentRepository.findByUserName(userName);
		return student;
	}
	

}
