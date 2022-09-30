package model;

public class Course 
{  
	private int cid;
	private String cname,cduration;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCduration() {
		return cduration;
	}
	public void setCduration(String cduration) {
		this.cduration = cduration;
	}
	public Course(int cid, String cname, String cduration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
	}
	public Course(String cname, String cduration) {
		super();
		this.cname = cname;
		this.cduration = cduration;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	} 
	

}
