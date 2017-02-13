package demo.entity;

/**
 * Authority entity. @author MyEclipse Persistence Tools
 */

public class Authority implements java.io.Serializable {

	// Fields
	private Long voteid;
	private String school;
	private String major;
	private String grade;
	private Long classno;
	private String identity;

	// Constructors
	/** default constructor */
	public Authority() {
	}

	/** minimal constructor */
	public Authority(Long voteid) {
		this.voteid = voteid;
	}

	/** full constructor */
	public Authority(Long voteid, String school, String major, String grade, Long classno, String identity) {
		this.voteid = voteid;
		this.school = school;
		this.major = major;
		this.grade = grade;
		this.classno = classno;
		this.identity = identity;
	}

	// Property accessors
	public Long getVoteid() {
		return this.voteid;
	}

	public void setVoteid(Long voteid) {
		this.voteid = voteid;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Long getClassno() {
		return this.classno;
	}

	public void setClassno(Long classno) {
		this.classno = classno;
	}

	public String getIdentity() {
		return this.identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

}