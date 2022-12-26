package otherpackage;

import mypackage.MyClass;

public class OtherPackage {

	public static void main(String[] args) {
		
		// MyClass의 인스턴스를 생성한 후 필드와 메서드에 접근
		MyClass mc = new MyClass();
		
		
		// package, protected, public 접근 지정자로 선언된 멤버 필드는 접근 가능
		// mc.privatedInt = 10;
//		
//		mc.packageInt = 10;	//패키지가 달라서
//		mc.protectedInt = 10;	//상속관계가 없어서
		mc.publicInt = 10;
//		
//		// mc.privateMethod();
//		mc.packgeMethod();
//		mc.protectedMethod();
		mc.publicMethod();
	

	}

}

}
