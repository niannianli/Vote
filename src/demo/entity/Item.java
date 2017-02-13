package demo.entity;

/**
 * Item entity. @author MyEclipse Persistence Tools
 */

public class Item implements java.io.Serializable {

	// Fields
	private Long itemid;
	private Long voteid;
	private String label;
	private String content;
	private Long count;

	// Constructors
	/** default constructor */
	public Item() {
	}

	/** minimal constructor */
	public Item(Long itemid) {
		this.itemid = itemid;
	}

	/** full constructor */
	public Item(Long itemid, Long voteid, String label, String content, Long count) {
		this.itemid = itemid;
		this.voteid = voteid;
		this.label = label;
		this.content = content;
		this.count = count;
	}

	// Property accessors
	public Long getItemid() {
		return this.itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public Long getVoteid() {
		return this.voteid;
	}

	public void setVoteid(Long voteid) {
		this.voteid = voteid;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

}