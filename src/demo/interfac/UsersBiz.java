package demo.interfac;

import java.util.List;

import demo.entity.Users;

public interface UsersBiz {
	//���������û�
	public List<Users>findAll();
	//��֤��¼
	public Boolean login(String name,String pwd);
	//�����û��������û�
	public Users findByName(String name);
	//�����û�
	public void mergeUsers(Users u);
	//��ȡ�µ�IDֵ
	public Long getNewId();
	//����û�
	public void adduser(Users u);
}
