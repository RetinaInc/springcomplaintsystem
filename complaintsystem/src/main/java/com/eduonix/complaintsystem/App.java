package com.eduonix.complaintsystem;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eduonix.complaintsystem.dao.ComplaintDao;
import com.eduonix.complaintsystem.entities.Complaint;

/**
 * Hello world!
 *
 */
@Controller
@PropertySource({"classpath:admin-properties.properties"})
public class App 
{
	@Autowired
	private Environment env;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("/helloWorld")
    public String helloWorld() {
    	return "helloWorld";
    }
	
	@RequestMapping("/fileComplaint")
    public String fileComplaint() {
		/* test code
		Complaint p = new Complaint(1, "Hello", "Bob", "bob@bob.com");
		ComplaintDao dao= new ComplaintDao(sessionFactory);
		dao.insertComplaint(p);
		for(Complaint i : dao.getAllComplaints()) {
			System.out.println(i.getMessage());
		}
		*/
    	return "fileComplaint";
    }
	
	@RequestMapping("/submitComplaint")
    public String submitComplaint(
    			@RequestParam("complaint") String complaint,
    			@RequestParam("name") String name,
    			@RequestParam("email") String email
    			
    		) {
		ComplaintDao dao= new ComplaintDao(sessionFactory);
		Complaint d = new Complaint(complaint, name, email);
		dao.insertComplaint(d);
		System.out.println("Complaint Inserted.");
    	return "submitComplaint";
    }
	
	@RequestMapping(name= "/showComplaints", method = RequestMethod.GET)
    public String showComplaints() {
    	return "showEnterPassword";
    }
	/*
	@RequestMapping(name ="/showComplaints", method= RequestMethod.POST)
    public String showComplaintsPost(@RequestParam("pass") String pass, Model model) {
    	if (pass.equals(env.getProperty("admin.password"))) {
    		ComplaintDao dao= new ComplaintDao(sessionFactory);
    		List<Complaint> complaints = dao.getAllComplaints();
    		model.addAttribute("complaints", complaints);
    		return "showComplaints";
    	} else {
    		return "showEnterPassword";
    	}
		
    }
    */
	@RequestMapping(name ="/showComplaints", method= RequestMethod.POST)
    public ModelAndView showComplaintsPost(@RequestParam("pass") String pass, ModelAndView modelAndView) {
    	if (pass.equals(env.getProperty("admin.password"))) {
    		ComplaintDao dao= new ComplaintDao(sessionFactory);
    		List<Complaint> complaints = dao.getAllComplaints();
    		modelAndView.addObject("complaints", complaints);
    		modelAndView.setViewName("showComplaints");
    		
    	} else {
    		modelAndView.setViewName("showEnterPassword");
    		
    	}
    	return modelAndView;
		
    }
	
}
