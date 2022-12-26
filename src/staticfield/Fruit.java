package staticfield;

public class Fruit {
	
	final int CONST_NUM_TEN;
	static final int CUNST_NUM_NINE;
	
	
	void changeFinal () {
//		CONST_NUM_TEN = 100
//		CONST_NUM_NINE = NINE = 99;	
		
	}

		Fruit() {
			CONST_NUM_TEN = 10;
			// 생성자에서 static final 상수를 초기화할 수 없음
		}
		
		static {
//			CONST_NUM_TEN = 10;
			CONST_NUM_NINE = 9;
		}

//	int m = 3;
//	static int n = 5;
//	
//	A() {
//		System.out.println(m);
//		System.out.println(n);
//		System.out.println("A() is called");
//	}
//	
//	static {			// <=제일 먼저 실행되고, 해당 블록 안에서 정적 멤버 초기화를 수행할 수 있음
//		n=50;
//		//m은 인스턴스 변수이므로 static 블록에서 사용할 수 없음
//		System.out.println(n);
//		System.out.println("A() is runned");
//	}
//	
//	public static void main(String[] args) {
//		
//	}

}
