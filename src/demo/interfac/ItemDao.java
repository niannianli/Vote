package demo.interfac;

import java.util.List;

import demo.entity.Item;

public interface ItemDao {
	//查看所有的选项
	public List<Item> findAll();	
	//更新投票
	public void mergevote(Item item);
	//获取新的ID值
	public Long getNewId();
	//根据ID查找选项
	public Item getById(Long id);	
}
