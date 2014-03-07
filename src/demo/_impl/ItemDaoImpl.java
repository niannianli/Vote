package demo._impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import demo.entity.Item;
import demo.interfac.ItemDao;

public class ItemDaoImpl extends HibernateDaoSupport implements ItemDao {

	public List<Item> findAll() {
		
		return getHibernateTemplate().find("from Item");
	}
	public void mergevote(Item item) {
		getHibernateTemplate().merge(item);
	}
	
	public Long getNewId() {
		Long id=(Long) getHibernateTemplate().find("select max(itemid) from Item").get(0)+1;
		return id;
	}
	
	//根据ID查找选项
	public Item getById(Long id){
		return (Item) getHibernateTemplate().get(Item.class,id);
	}
}
