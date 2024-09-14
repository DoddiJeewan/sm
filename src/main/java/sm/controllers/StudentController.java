package sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import sm.DAO.*;
import sm.api.*;

@Controller
public class StudentController {

	@Autowired
	private StudentDAO StudentDAO;

	@GetMapping(value = "/showStudent")
	public String showStudentList(Model model) {

		List<Student> studentList = StudentDAO.loadStudents();
		model.addAttribute("students", studentList);

		return "student-list";
	}

	@GetMapping(value = "/addStudent")
	public String addStudent(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);

		return "add-student";
	}

	@PostMapping(value = "/saveStudent")
	public String saveStudent(Student student) {

		StudentDAO.saveStudent(student);
		return "redirect:/thankyou";
	}

	@GetMapping(value = "/thankyou")
	public String thankyou() {
		return "redirect:/showStudent";
	}
}

//Presentation layer
