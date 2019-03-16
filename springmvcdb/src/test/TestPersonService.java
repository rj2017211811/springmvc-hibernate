package test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.czt.springmvc.domain.Person;
import per.czt.springmvc.service.PersonService;


public class TestPersonService {
	
	private static ApplicationContext ac;
	
	static
	{
		 ac=new ClassPathXmlApplicationContext("beans.xml");
		 System.out.println("ac:"+ac);
	
	}
	@Test
	public static void test()
	{
		PersonService personService=(PersonService) ac.getBean("personService");
		
		Person p=new Person();
	
		p.setName("zhangsan");
		p.setAge(1);
		
		personService.save(p);
	
		
	}
	public static void main(String []args)
	{
		
		test();
		
	}
}
