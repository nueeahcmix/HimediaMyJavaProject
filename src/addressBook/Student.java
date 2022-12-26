package addressBook;

public class Student extends Person {
	private static final String phoneNo = null;
	String studentNo;

	public Student(String name, String phoneNo, String studentNo) {
		super(name, phoneNo);
		this.studentNo = studentNo;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%d\t", super.getName(), super.getPhone(), this.getStudentNo());
	}	//super,this 안 써도 상관없지만 어디서 가져왔는지 명시하기 위해

}
