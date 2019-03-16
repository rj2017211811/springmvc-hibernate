package per.czt.springmvc.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import per.czt.springmvc.domain.Person;

@Repository("personDao")

public class PersonDaoImpl  implements PersonDao {
	
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("sessionFactory:"+sessionFactory);
		this.sessionFactory = sessionFactory;
	
	}

	@Override
	public List<Person> listAll(String hql) {
		List<Person> personList=(List<Person>) sessionFactory.getCurrentSession().createQuery(hql).list();
		//System.out.println("personList:"+personList.size());
		return personList;
	}

	@Override
	public Person getById(Integer id) {
		
		return (Person)sessionFactory.getCurrentSession().get(Person.class, id);
	}

	@Override
	public void save(Person p) {
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		
	}

	@Override
	public void deleteById(Integer id) {
		sessionFactory.getCurrentSession().delete(this.getById(id));
		
	}

	@Override
	public void update(Person p) {
		System.out.println("udpate");
	   // sessionFactory.getCurrentSession().createQuery("update Person set name='"+p.getName()+"',age="+p.getAge()+" where id="+p.getId());
	    sessionFactory.getCurrentSession().update(p);
		
	}

}
