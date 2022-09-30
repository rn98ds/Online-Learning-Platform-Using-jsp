package model;

public class purchase
{
    public purchase() {
		super();
	}
	public purchase(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
    
	private int pid;
    private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
}
