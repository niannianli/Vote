package demo.entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {
	
	// Fields

	private Long userid;
	private String name;
	private String pwd;
	private String school;
	private String major;
	private String grade;
	private Long classno;
	private String identity;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Long userid) {
		this.userid = userid;
	}

	/** full constructor */
	public Users(Long userid, String name, String pwd, String school, String major,
			String grade, Long classno, String identity) {
		this.userid = userid;
		this.name = name;
		this.pwd=pwd;
		this.school = school;
		this.major = major;
		this.grade = grade;
		this.classno = classno;
		this.identity = identity;
	}

	// Property accessors

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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