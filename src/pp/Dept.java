package pp;

public class Dept {
	
	private int deptId;
	private String deptName;
	private String deptDesc;

	public Dept() {
		System.out.println("Default constructor is called !");
	}
	
	public Dept(int deptId) {
		this.deptId = deptId;
		System.out.println("Default constructor is called !");
	}
	
	public Dept(int deptId, String deptName, String deptDesc) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptDesc = deptDesc;
		System.out.println("All argument construtor is called !");
	}

	public Dept(String deptName) {
		this.deptName = deptName;
		System.out.println("Default constructor is called !");
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + ", deptDesc=" + deptDesc + "]";
	}

}
