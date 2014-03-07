package demo.action;

import java.util.List;

import demo.interfac.UsersBiz;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import demo.entity.Users;

public class UsersAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private UsersBiz usersBiz;
	private Users u;	

	public Users getU() {
		return u;
	}

	public void setU(Users u) {
		this.u = u;
	}

	public void setUsersBiz(UsersBiz usersBiz) {
		this.usersBiz = usersBiz;
	}
	/**
	 * 老师 学生功能部分
	 */
	//登录
	public String login(){		
		Boolean flag=usersBiz.login(u.getName(),u.getPwd());		
		if(flag==true){	
			Users user=usersBiz.findByName(u.getName());
			ActionContext.getContext().getSession().put("user",user);
			return SUCCESS;
		}else{
			return INPUT;
		}		
	}
	//找回密码
	public String getpwd(){
		Users us=new Users();
		us=usersBiz.findByName(u.getName()); 
		ActionContext.getContext().put("us",us);
		System.out.println(us.getPwd());
		return SUCCESS;
	}
	//注销
	public String loginout(){
		ActionContext.getContext().getSession().clear();
		return SUCCESS;
	}
	//修改密码
	public String mergepwd(){
		Users us=(Users) ActionContext.getContext().getSession().get("user");
		us.setPwd(u.getPwd());
		usersBiz.mergeUsers(us);
		return SUCCESS;
	}
	
	/**
	 * 管理员功能部分
	 */
	//查看所有用户
	public String queryuser(){
		List<Users> list=usersBiz.findAll();
		ActionContext.getContext().put("list",list);
		return SUCCESS;
	}
	//添加用户
	public String adduser(){
		Users us=new Users();
		us.setUserid(usersBiz.getNewId());
		us.setClassno(u.getClassno());
		us.setGrade(u.getGrade());
		us.setIdentity(u.getIdentity());
		us.setMajor(u.getMajor());
		us.setName(u.getName());
		us.setPwd(u.getPwd());
		us.setSchool(u.getSchool());
		usersBiz.adduser(us);
		
		List<Users> list=usersBiz.findAll();
		ActionContext.getContext().put("list",list);
		return SUCCESS;
	}
	
}
