package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchDateTimeService());
		return mav;
	}
}
