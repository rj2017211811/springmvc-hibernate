package per.czt.springmvc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.czt.springmvc.dao.PersonDao;
import per.czt.springmvc.dao.PersonDaoImpl;
import per.czt.springmvc.domain.Person;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Resource(name="personDao")
	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public List<Person> listAll(String hql) {
		
		//System.out.println("personDao:"+personDao);
		return personDao.listAll(hql);
	}

	@Override
	public Person getById(Integer id) {
		// TODO Auto-generated method stub
		return personDao.getById(id);
	}

	@Override
	public void save(Person p) {
		personDao.save(p);

	}

	@Override
	public void deleteById(Integer id) {
		personDao.deleteById(id);

	}

	@Override
	public void update(Person p) {
		// TODO Auto-generated method stub
		personDao.update(p);
	}

}
