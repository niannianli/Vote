package demo.interfac;

import java.util.List;
import demo.entity.Users;

public interface UsersDao {

	public List<Users>findAll();

	public Users findByName(String name);

	public void mergeUsers(Users u);

	public Long getNewId();

	public void adduser(Users u);
}
