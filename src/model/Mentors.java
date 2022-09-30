package model;

public class Mentors 
{
    public Mentors() {
		super();
	}
	public Mentors(String mname, String msubject) {
		super();
		this.mname = mname;
		this.msubject = msubject;
	}
	public Mentors(int mid, String mname, String msubject) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.msubject = msubject;
	}
	private int mid;
    private String mname,msubject;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMsubject() {
		return msubject;
	}
	public void setMsubject(String msubject) {
		this.msubject = msubject;
	}
	
}
