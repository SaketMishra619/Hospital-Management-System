package com.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Acontroller {

	@RequestMapping("delete")
	public static ModelAndView delete() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("delete");
		return mv;
	}
	@RequestMapping("header")
	public static ModelAndView header() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("header");
		return mv;
	}
	@RequestMapping("index")
	public static ModelAndView index() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("patientdetails")
	public static ModelAndView patientdetails() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("patientdetails");
		return mv;
	}
	@RequestMapping("registration")
	public static ModelAndView registration() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("registration");
		return mv;
	}
	@RequestMapping("update")
	public static ModelAndView update() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("update");
		return mv;
	}
	@RequestMapping("viewpatient")
	public static ModelAndView viewpatient() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("viewpatient");
		return mv;
	}
	@RequestMapping("viewpatients")
	public static ModelAndView viewpatients() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("viewpatients");
		return mv;
	}
}
