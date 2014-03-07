package demo.interfac;

import java.util.List;

import demo.entity.Users;

public interface UsersBiz {
	//查找所有用户
	public List<Users>findAll();
	//验证登录
	public Boolean login(String name,String pwd);
	//根据用户名查找用户
	public Users findByName(String name);
	//更新用户
	public void mergeUsers(Users u);
	//获取新的ID值
	public Long getNewId();
	//添加用户
	public void adduser(Users u);
}
