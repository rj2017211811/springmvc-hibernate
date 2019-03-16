package per.czt.springmvc.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import per.czt.springmvc.domain.Person;
import per.czt.springmvc.service.PersonService;


@Controller
@RequestMapping("/person")
public class PersonController {
	@Resource
	private PersonService personService;
	
	
     
	@RequestMapping("/listAll")
	public String listAll(Model model)
	{
		/*ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		personService=(PersonService) ac.getBean("personService");*/

	
		//System.out.println("personService:"+personService);
		List<Person> personList=personService.listAll("from Person");
		//System.out.println("personList.size()"+personList);
		model.addAttribute(personList);
		return "person/personList";
		
	}
	@RequestMapping("/delete")
	public String delete(Integer id)
	{
	/*	ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		personService=(PersonService) ac.getBean("personService");
		System.out.println("personService:"+personService);*/
		personService.deleteById(id);
		return "redirect:listAll";
		
	}
	@RequestMapping("/save")
	public String save(String name,Integer age)
	{
		Person p=new Person();
		p.setName(name);
		p.setAge(age);
		personService.save(p);
		return "redirect:listAll";
	}
	@RequestMapping("/toAdd")
	public String toAdd()
	{
		return "person/personAdd";
		
	}
	@RequestMapping("/toUpdate")
	public String toUpdate(Integer id,Model model)
	{
		Person p=new Person();
		p=personService.getById(id);
		model.addAttribute(p);
		return "person/personUpdate";
		
	}
	
	@RequestMapping("/update")
	public String update(Integer id,String name,Integer age)
	{
		Person p=new Person();
		p.setName(name);
		p.setAge(age);
		p.setId(id);
		personService.update(p);
		return "redirect:listAll";
	}

}
