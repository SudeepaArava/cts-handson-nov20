package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value = "/sortByNameDesc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesByNameDesc() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeeNamesInDescOrder());
		return mav;
	}
	@RequestMapping(value = "/sortByNameAsc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesByNameAsc() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeeNamesInAscOrder());
		return mav;
	}
	@RequestMapping(value = "/sortByIdAsc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesByIdAsc() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeeIdInAscOrder());
		return mav;
	}
	@RequestMapping(value = "/sortByIdDesc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesByIdDesc() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeeIdInDescOrder());
		return mav;
	}
	@RequestMapping(value = "/sortBySalaryAsc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesBySalaryAsc() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeeSalaryInAscOrder());
		return mav;
	}
	@RequestMapping(value = "/sortBySalaryDesc", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesBySalaryDesc() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeeSalaryInDescOrder());
		return mav;
	}
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ModelAndView extractEmployeeById(@RequestParam("employeeId") int id) {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchEmployeeById(id));
		return mav;
	}
	
	@RequestMapping(value="multiplekeys", method= RequestMethod.GET)
	public ModelAndView fetchMultipleKeys()
	{
		ModelAndView mav=null;
		ModelMap modelMap=new ModelMap();
		modelMap.put("title","Simple Title");
		modelMap.put("employeesObj",new Employee(100,"Rahul", 20000));
		modelMap.put("employeeList",service.getAllEmployeeNamesInAscOrder());
		mav=new ModelAndView("welcome","model",modelMap);
		return mav;
	}
	@GetMapping(value ="/storeDetails")
	public String addEmp() {
		return "storeEmployee";
	}
	@GetMapping(value="/deleteDetails")
	public String delEmp()
	{
		return "deleteEmployee";
		
	}
	
	//@PostMapping(value="/success")
	//public String addEmployee(@RequestParam("employeeId") int id,@RequestParam("employeeName") String name,@RequestParam("salary") double salary)
	//{
		//service.addEmployees(id, name, salary);
		//return "success";
	//}
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public ModelAndView addEmployee(@RequestParam("employeeId") int id,@RequestParam("employeeName") String name,@RequestParam("salary") double salary)
	{
		ModelAndView mav=new ModelAndView("success","msg",service.addEmployees(id, name, salary));
        return mav;
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView deleteEmployee(@RequestParam("employeeId") int id) {
		
		ModelAndView mav=new ModelAndView("delete","msg",service.deleteEmployees(id));
		return mav;
	}
	
	
}
