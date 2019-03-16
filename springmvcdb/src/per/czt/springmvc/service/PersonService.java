package per.czt.springmvc.service;

import java.util.List;

import per.czt.springmvc.domain.Person;

public interface PersonService {
	public List<Person> listAll(String hql);
	public Person getById(Integer id);
	public void save(Person p);
	public void deleteById(Integer id);
	public void update(Person p);
}
