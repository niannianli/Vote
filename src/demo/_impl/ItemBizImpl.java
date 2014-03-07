package demo._impl;

import java.util.List;

import demo.entity.Item;
import demo.interfac.ItemBiz;
import demo.interfac.ItemDao;

public class ItemBizImpl implements ItemBiz {
	private ItemDao itemDao;	
	
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public List<Item> findAll() {		
		return itemDao.findAll();
	}
	public void mergevote(Item item) {
		itemDao.mergevote(item);		
	}
	public Long getNewId() {		
		return itemDao.getNewId();
	}
	//根据ID查找选项
	public Item getById(Long id){
		return itemDao.getById(id);
	}
}
