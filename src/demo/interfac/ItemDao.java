package demo.interfac;

import java.util.List;

import demo.entity.Item;

public interface ItemDao {
	//�鿴���е�ѡ��
	public List<Item> findAll();	
	//����ͶƱ
	public void mergevote(Item item);
	//��ȡ�µ�IDֵ
	public Long getNewId();
	//����ID����ѡ��
	public Item getById(Long id);	
}
