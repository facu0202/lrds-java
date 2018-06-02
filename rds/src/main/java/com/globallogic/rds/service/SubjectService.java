package com.globallogic.rds.service;

import java.util.ArrayList;
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
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Iterable<Subject> findAll()
	{
		return subjectRepository.findAll();
	}
	
	public List<Subject> findBySubjectToJoin(Long idStudent) throws RutaDelSoftwareException
	{
		List<Subject> result= new ArrayList<Subject>();
		 Optional<Student> os = studentRepository.findById(idStudent);
		 if (!os.isPresent())
			 throw new RutaDelSoftwareException("El estudiante no existe");
		 
		 Student st = os.get();
		 for (Subject subject : subjectRepository.findAll()) {
			if (!st.getSubjects().contains(subject))
				result.add(subject);
		}
		 return result;
	}

}
