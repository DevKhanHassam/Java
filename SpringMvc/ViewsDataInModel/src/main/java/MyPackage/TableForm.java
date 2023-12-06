package MyPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import MyPackage2.Human;

@Controller
public class TableForm {

	
	@RequestMapping("/tableform")
	public String Table(Model m)
	{
		return "TableForm";

	}
	
	
	@RequestMapping(path ="/dataHandle", method =RequestMethod.POST)
	public String dataHandling(@ModelAttribute Human human,Model m)
	{	

		return "Success";
	}
	{
		
	}
	
	
}
