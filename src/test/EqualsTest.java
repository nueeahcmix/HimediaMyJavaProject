package test;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	// 실제 내용(이름)을 비교하도록 equals 메서드를 오버라이딩
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			if (person.name == this.name) {
				return true;
			}
			
		}return false;
		
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		Person p1 =  new Person("홍길동");
		Person p2 =  new Person("홍길동");

		System.out.println(p1.hashCode());	
		System.out.println(p2.hashCode());	

		System.out.println(p1 == p2);		//false
		System.out.println(p1.equals(p2));	//false
		
		Person p3 = p1;
		System.out.println(p3.hashCode());
		
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));

	}

}
