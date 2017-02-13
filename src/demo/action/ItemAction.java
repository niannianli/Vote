package demo.action;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import demo.entity.Item;
import demo.interfac.ItemBiz;

public class ItemAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private ItemBiz itemBiz;
	private Item item;
	private Long[] arr;
	
	public void setItemBiz(ItemBiz itemBiz) {
		this.itemBiz = itemBiz;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Long[] getArr() {
		return arr;
	}

	public void setArr(Long[] arr) {
		this.arr = arr;
	}

	public String queryItem() {
		List<Item> list = itemBiz.findAll();
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}

	public String mergeitem() {
		List<Item> list = itemBiz.findAll();
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}

	public String updateitem() {
		List<Item> list = new ArrayList<Item>();
		for (int i = 0; i < arr.length; i++) {
			Item it = itemBiz.getById(arr[i]);
			it.setCount(it.getCount() + 1);
			itemBiz.mergevote(it);
			list.add(it);
		}
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}

	public String updateresult() {
		List<Item> list = itemBiz.findAll();
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}

	public String mergeresult() {
		//System.out.println("**********");
		List<Item> list = new ArrayList<Item>();
		for (Item i : list) {
			System.out.println(item.getItemid());
			i = itemBiz.getById(item.getItemid());
			i.setCount(item.getCount());
			list.add(i);
		}
		for (Item i : list) {
			itemBiz.mergevote(i);
		}
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}

}