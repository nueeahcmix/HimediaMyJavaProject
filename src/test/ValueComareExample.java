package test;

public class ValueComareExample {

	public static void main(String[] args) {

		int i1 = 100;
		int i2 = 100;
		System.out.println(i1 == i2);	//true
		
		Integer ii1 = 128;
		Integer ii2 = 128;
		System.out.println(ii1 == ii2);
		System.out.println(ii1.equals(ii2));
		
		Integer ii3 = 127;
		Integer ii4 = 127;
		System.out.println(ii3 == ii4);
		System.out.println(ii4.equals(ii4));
		
	}

}
