package otherpackage;

import mypackage.MyClass;

public class MyOtherClass extends MyClass {
	
	// 부모 클래스(My Class)가 가지고 있는 멤버에 대한 접근을 확인
	void accessMyClassMember() {
		// privateInt = 10;
		// packgeInt = 10;
		protectedInt = 10;
		publicInt = 10;
		
		// privateMethod();
		// packageMethod();
		protectedMethod();
		publicMethod();
	
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		// moc.protectedInt = 10;
		
		MyOtherClass moc = new MyOtherClass();
		moc.protectedInt = 10;

	}

}

	
