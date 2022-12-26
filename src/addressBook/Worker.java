package addressBook;

public class Worker extends Person {
	
	public String workerNo;

	public Worker(String name, String phoneNo, String workerNo) {
		super(name, phoneNo);
		this.workerNo = workerNo;
	}

	public String getWorkerNo() {
		return workerNo;
	}

	public void setWorkerNo(String workerNo) {
		this.workerNo = workerNo;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\t", super.getName(), super.getPhone(), this.getWorkerNo());
	}
	
}
