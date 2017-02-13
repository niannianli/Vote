package demo._impl;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import demo.entity.Users;
import demo.interfac.UsersBiz;
import demo.interfac.UsersDao;

public class UsersBizImpl implements UsersBiz {
	private UsersDao usersDao;	
	
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public List<Users>findAll(){
		return usersDao.findAll();
	}

	public Boolean login(String name, String pwd) {
		Boolean flag=false;
		List<Users>list=usersDao.findAll();
		for(Users u:list){
			if(u.getName().equals(name)&&u.getPwd().equals(pwd)){
				flag=true;
			}			
		}
		return flag;
	}
	
	public Users findByName(String name) {
		return usersDao.findByName(name);		
	}
	
	public void mergeUsers(Users u) {
		usersDao.mergeUsers(u);
	}
	
	public Long getNewId() {
		return usersDao.getNewId();
	}
	
	public void adduser(Users u) {
		usersDao.adduser(u);
	}

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		UsersBizImpl ui=(UsersBizImpl) app.getBean("usersBiz");
//		Users u=ui.findByName("tom");
//		System.out.println(u.getGrade()+"\n"+u.getIdentity()+"\n"+u.getMajor()
//				+"\n"+u.getName()+"\n"+u.getPwd()+"\n"+u.getSchool()+"\n"
//				+u.getClassno()+"\n"+u.getUserid());
		System.out.println(ui.getNewId());
	}
}