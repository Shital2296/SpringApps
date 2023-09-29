package in.shital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shital.entity.Student;
import in.shital.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		init(model);
		return "index";
	}

	
	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("prefTimings", service.getTimings());
	}
	
	@PostMapping("/save")
	public String handleSubmitBtn(Student s, Model model) {
		
		//calling saveStudent method of service class 
		boolean isSaved=service.saveStudent(s);
		if(isSaved) {
			model.addAttribute("msg", "Data saved....");
		}
		
		init(model);
		return "index";
	}
	
}


//in the first method, we are loading the index page.
//we are using the model object to send the data from controller to ui
//in line no 20, we are giving the empty object student to the index.jsp page
//also we are not hardcoding the values of courses and timings in the ui, we are simply getting those values from service method

//in the 2nd method, we are using post method to save the data in student object which we are getting from user in ui
//and simply giving back a msg on the ui page after user clicks save button

//in this app, we have used pre-defined library tags in web mvc for developing ui page

//select===>refactor=======>extract method
