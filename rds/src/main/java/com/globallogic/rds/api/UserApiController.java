package com.globallogic.rds.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.globallogic.rds.api.model.AlumnoMateriaType;
import com.globallogic.rds.api.model.BasicUserType;
import com.globallogic.rds.api.model.HeaderType;
import com.globallogic.rds.api.model.ListOfAlumnoMateriaType;
import com.globallogic.rds.api.model.ListOfMateriasType;
import com.globallogic.rds.api.model.LoginType;
import com.globallogic.rds.api.model.LoguotType;
import com.globallogic.rds.api.model.UserType;
import com.globallogic.rds.domain.Student;
import com.globallogic.rds.domain.Subject;
import com.globallogic.rds.exception.RutaDelSoftwareException;
import com.globallogic.rds.mapper.Mapper;
import com.globallogic.rds.service.StudentService;
import com.globallogic.rds.service.SubjectService;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-15T23:29:47.910Z")

@Controller
public class UserApiController implements UserApi {

	private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SubjectService subjectService;

	@Autowired
	private Mapper<UserType, Student> studentMapper;
	
	@Autowired
	private Mapper<AlumnoMateriaType, Subject> subjectTo;

	@org.springframework.beans.factory.annotation.Autowired
	public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Void> changeMateria(@PathVariable("user_id") String userId,
			@PathVariable("materia_id") String materiaId) {
		try {
			this.studentService.changeSubject(Long.parseLong(userId), Long.parseLong(materiaId));
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} catch (RutaDelSoftwareException e) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} catch (Exception e)
		{
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<AlumnoMateriaType> getMateria(@PathVariable("user_id") String userId,
			@PathVariable("materia_id") String materiaId) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<AlumnoMateriaType>(objectMapper.readValue("\"\"", AlumnoMateriaType.class),
						HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<AlumnoMateriaType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<AlumnoMateriaType>(HttpStatus.NOT_IMPLEMENTED);
	}

	
	public ResponseEntity<ListOfMateriasType> getMaterias(@PathVariable("user_id") String userId) {
		try {
		List <Subject> result = subjectService.findBySubjectToJoin(Long.parseLong(userId));
		return getMaterias(result);
		}
		catch (RutaDelSoftwareException e)
		{
			return new ResponseEntity<ListOfMateriasType>(HttpStatus.NOT_FOUND);
		}
		catch (Exception e)
		{
			return new ResponseEntity<ListOfMateriasType>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<UserType> getUserByName(@PathVariable("userName") String userName,
			@RequestHeader(value = "token", required = true) String token) {
		Student st = studentService.find(userName);
		if (st != null)
			return new ResponseEntity<UserType>(studentMapper.toDto(st), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	public ResponseEntity<HeaderType> login(@Valid @RequestBody LoginType login) {
		Student st = studentService.login(login.getUserName(), login.getPassword());
		if (st != null) {
			return new ResponseEntity<HeaderType>(getHeaderType(st), HttpStatus.OK);
		}
		return new ResponseEntity<HeaderType>(HttpStatus.FORBIDDEN);
	}

	public ResponseEntity<Void> loguot(@RequestHeader(value = "token", required = true) String token,
			@Valid @RequestBody LoguotType loguot) {
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

	public ResponseEntity<HeaderType> singin(@Valid @RequestBody BasicUserType sigin) {
		return new ResponseEntity<HeaderType>(HttpStatus.INTERNAL_SERVER_ERROR);

	}

	private HeaderType getHeaderType(Student st) {
		HeaderType ht = new HeaderType();
		Date date = new Date();
		ht.setTime("" + date.getTime());
		ht.setToken(st.getSurname() + "" + date.getTime());
		return ht;
	}
	private ResponseEntity<ListOfMateriasType> getMaterias(List <Subject> pResult)
	{
		List<AlumnoMateriaType> materias = new ArrayList<AlumnoMateriaType>();
		for (Subject subject : pResult) {
			materias.add(subjectTo.toDto(subject));
		}
		ListOfAlumnoMateriaType loamt = new ListOfAlumnoMateriaType();
		loamt.addAll(materias);
		ListOfMateriasType loft = new ListOfMateriasType();
		loft.add(loamt);
	
		return new ResponseEntity<ListOfMateriasType>(loft,HttpStatus.OK);
	}
	
}
