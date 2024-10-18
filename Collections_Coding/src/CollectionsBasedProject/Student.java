package CollectionsBasedProject;

public class Student {
	private int Sid;
	private String Sname;
	private int Sage;
	
	
	public Student(){
		super();
		
	}
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSage() {
		return Sage;
	}
	public void setSage(int sage) {
		Sage = sage;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return   "Student{sid=" + Sid + ", name='" + Sname + "', age=" + Sage + "}";
	}

}
