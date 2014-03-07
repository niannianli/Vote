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

	public void setItemBiz(ItemBiz itemBiz) {
		this.itemBiz = itemBiz;
	}
	
	private Item item;	
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	private Long[] arr;
	
	public Long[] getArr() {
		return arr;
	}

	public void setArr(Long[] arr) {
		this.arr = arr;
	}

	//查看投票主题
	public String queryItem(){
		List<Item> list=itemBiz.findAll();
		ActionContext.getContext().put("list",list);
		return SUCCESS;
	}
	
	//投票
	public String mergeitem(){
		List<Item> list=itemBiz.findAll();
		ActionContext.getContext().put("list",list);
		return SUCCESS;
	}
	//保存投票
	public String updateitem(){
		List<Item> list=new ArrayList<Item>();
		for(int i=0;i<arr.length;i++){
			Item it=itemBiz.getById(arr[i]);
			it.setCount(it.getCount()+1);
			itemBiz.mergevote(it);
			list.add(it);
		}
		ActionContext.getContext().put("list",list);
		return SUCCESS;
	}
	/**
	 * 管理员功能部分
	 */
	//更新投票结果
	public String updateresult(){
		List<Item> list=itemBiz.findAll();
		ActionContext.getContext().put("list",list);
		return SUCCESS;
	}
	//保存更新结果
	public String mergeresult(){
		System.out.println("**********");
		List<Item> list=new ArrayList<Item>();
		for(Item i:list){
			System.out.println(item.getItemid());
			i=itemBiz.getById(item.getItemid());
			i.setCount(item.getCount());
			list.add(i);
		}				
		for(Item i:list){
			itemBiz.mergevote(i);
		}
		ActionContext.getContext().put("list",list);
		return SUCCESS;
	}
	
	
}
