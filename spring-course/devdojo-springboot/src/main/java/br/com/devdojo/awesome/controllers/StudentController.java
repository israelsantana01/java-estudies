package br.com.devdojo.awesome.controllers;

import java.util.List;

import javax.swing.event.ListSelectionEvent;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdojo.awesome.models.Student;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("students")
public class StudentController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/list")

	public List<Student> listAll() {
		return asList(new Student("Deku"), new Student("Todoroki"));
	}
}
