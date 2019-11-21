package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.beans.Student;
import com.example.demo.repository.studentRepo;

import java.util.List;



@Controller
public class StudentController {
	@Autowired
	private studentRepo repo;
@GetMapping("/Student")
public String showHomePage() {

return "index";
}
@PostMapping("/Student/success")
public String login(Student student,Model model) {
	repo.save(student);
model.addAttribute("s",student);
return "success";
}
@GetMapping("/Student/all")
public String getStudents(Model model) {
List<Student> studentList=new ArrayList<Student>();
studentList=repo.findByName("appu");
model.addAttribute("studentList",studentList);
return"view";

}
}