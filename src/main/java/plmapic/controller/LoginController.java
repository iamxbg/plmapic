package plmapic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/login")
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(path="",method=RequestMethod.POST)
	public String login(@RequestParam("username") String username,
								@RequestParam("password") String password){
	
		
		
		return "/WEB-INF/view/desktop.jsp";
	}
}
