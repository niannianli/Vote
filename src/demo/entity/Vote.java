package demo.entity;

/**
 * Vote entity. @author MyEclipse Persistence Tools
 */

public class Vote implements java.io.Serializable {
	
	// Fields

	private Long voteid;
	private Long userid;
	private String title;
	private String question;
	private String classification;
	private String publishdate;
	private String finishdate;
	private Long avaliable;

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** minimal constructor */
	public Vote(Long voteid) {
		this.voteid = voteid;
	}

	/** full constructor */
	public Vote(Long voteid, Long userid, String title, String question,
			String classification, String publishdate, String finishdate,
			Long avaliable) {
		this.voteid = voteid;
		this.userid = userid;
		this.title = title;
		this.question = question;
		this.classification = classification;
		this.publishdate = publishdate;
		this.finishdate = finishdate;
		this.avaliable = avaliable;
	}

	// Property accessors

	public Long getVoteid() {
		return this.voteid;
	}

	public void setVoteid(Long voteid) {
		this.voteid = voteid;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getPublishdate() {
		return this.publishdate;
	}

	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public String getFinishdate() {
		return this.finishdate;
	}

	public void setFinishdate(String finishdate) {
		this.finishdate = finishdate;
	}

	public Long getAvaliable() {
		return this.avaliable;
	}

	public void setAvaliable(Long avaliable) {
		this.avaliable = avaliable;
	}

}