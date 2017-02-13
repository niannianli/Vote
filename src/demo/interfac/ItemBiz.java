package demo.interfac;

import java.util.List;
import demo.entity.Item;

public interface ItemBiz {
	public List<Item> findAll();

	public void mergevote(Item item);

	public Long getNewId();

	public Item getById(Long id);
}
