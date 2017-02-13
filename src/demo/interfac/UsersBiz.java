package demo.interfac;

import java.util.List;
import demo.entity.Users;

public interface UsersBiz {

	public List<Users>findAll();

	public Boolean login(String name,String pwd);

	public Users findByName(String name);

	public void mergeUsers(Users u);

	public Long getNewId();

	public void adduser(Users u);
}
