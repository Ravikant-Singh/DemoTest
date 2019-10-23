package com.org.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	@Autowired
	private StudentService st;
	
	
	@RequestMapping(value="/registartion",method=RequestMethod.POST)
	public String saveStudent(@Valid @ModelAttribute("st1")Student st1,BindingResult br)
	{System.out.println("registartion :"+st1.toString());
		if(br.hasErrors())
		{
			return "registration";
		}
		else {
		
		//st.addStudent(st1);
		return "login";
		}
		
	}
	
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getStudent(@Valid  Model model,@ModelAttribute("st1")Student st1,BindingResult br) {
	if(br.hasErrors()){
		return "login";
	}
	
	else{
	
	  List<Student> studentdetails=	st.getStudent();
	  model.addAttribute("studentlist", "studentdetails");
		return "list";
	}
	}
	
	
	
	
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable int id,Model model)
	{
		int id1 = st.deleteStudent(id);
		model.addAttribute("studentid", "id1");
		return"delete";
	}

}
