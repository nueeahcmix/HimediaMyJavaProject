package mybankv2;

import java.util.Scanner;

public class BankApplication {

	// 필드를 정의 => main 메서드에서 인스턴스 생성 없이 바로 사용할 수 있도록 static으로 정의
	private static Account[] accounts = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		boolean isRun = true;
		while(true) {
			// 메뉴를 출력
			System.out.println("--------------------------------------------------");
			System.out.println("1.계정생성 | 2.계좌목록 | 3.예금 |4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택 > ");
			
			// 선택한 메뉴 번호에 맞는 기능을호출
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				createAccount();
				break;
			case 2:
				showAccount();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				isRun = false;
				break;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
		private static void createAccount() {
			System.out.println("---------");
			System.out.println("계좌생성");
			System.out.println("---------");
			
			//계좌번호, 계좌주, 초기입금액을 입력
			System.out.print("계좌번호: ");
			String accountNo = scan.next();
			
			System.out.print("계좌주: ");
			String name = scan.next();
			
			System.out.print("초기입금액: ");
			int amount = scan.nextInt();
			
			Account account = new Account();
			account.setAccountNo(accountNo);
			account.s
		}
	
	}


