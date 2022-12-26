package addressBook;

public class Person {
	// 필드를 private으로 정의
	// 공통요소만
	private String name;
	private String phone;

	public Person(String name, String phone) {
	}

	// 필드의 값을 조회/설정할 수 있도록 getter/setter 메서드 정의
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 생성자를 정의하지 않았기때문에 디폴트 생성자가 올라올 것

	// print() 메서드 정의
	public void print() {
		System.out.printf("%s\t%s\n", name, phone);
	}
}
