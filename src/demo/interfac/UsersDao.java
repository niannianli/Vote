package demo.interfac;

import java.util.List;

import demo.entity.Users;

public interface UsersDao {
	//���������û�
	public List<Users>findAll();
	//�����û��������û�
	public Users findByName(String name);
	//�����û�
	public void mergeUsers(Users u);
	//��ȡ�µ�IDֵ
	public Long getNewId();
	//����û�
	public void adduser(Users u);
}
