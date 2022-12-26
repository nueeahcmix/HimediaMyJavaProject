package test;

public class MemberService {
	
	boolean login(String id, String password) {
		
		if (id.equals("hong") && password.equals("12345")) {
		//if(id=="hong" && password=="12345") {   <=문자열 값을 비교할 때는 equals를 사용
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
	
		
	
		
		
}
	
//logout

