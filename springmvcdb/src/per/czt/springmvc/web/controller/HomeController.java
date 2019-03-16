package per.czt.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class HomeController {
	
	@RequestMapping(value={"/","/home"})
	public String goHome()
	{
		System.out.println("homeController");
		return "index";
	}
	
}
