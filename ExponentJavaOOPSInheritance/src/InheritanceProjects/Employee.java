package InheritanceProjects;

public class Employee {

	private int eid;
	private String ename;
	private String edept;
	static String ecname = "Persistant co";

	final String egender = "Male";

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	private static void m1() {
		System.out.println("-----This is The 2022 EMployee Details------");
		System.out.println("------------------------------------------------");
	}

	static void m2() {
		System.out.println("****First Student Details****");
	}

	protected static void m3() {
		System.out.println("$$$$$$Multiple Students Details$$$$$");
	}

	public static void main() {
		m1();
	}

	@Override
	public String toString() {

		return eid + ename + edept;
	}
}
