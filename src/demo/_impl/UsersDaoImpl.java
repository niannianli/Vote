package demo._impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import demo.entity.Users;
import demo.interfac.UsersDao;

public class UsersDaoImpl extends HibernateDaoSupport implements UsersDao{

	@SuppressWarnings("unchecked")
	public List<Users> findAll() {
		List<Users>list=getHibernateTemplate().find("from Users");
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public Users findByName(String name) {
		List<Users>list=getHibernateTemplate().find("from Users u where u.name=?",name);		
		return list.isEmpty()?null:list.get(0);
	}
	
	public void mergeUsers(Users u) {
		getHibernateTemplate().merge(u);
	}
	
	public Long getNewId() {
		return (Long)getHibernateTemplate().find("select max(userid) from Users").get(0)+1;
	}
	
	public void adduser(Users u) {
		getHibernateTemplate().save(u);
	}
}