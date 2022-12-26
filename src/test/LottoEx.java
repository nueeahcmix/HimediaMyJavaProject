package test;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx {

	public static void main(String[] args) {

		// 사용자 입력 -> 정렬 -> 출력
		System.out.println("> 1부터 45 사이의 6개의 숫자를 입력하세요.");
		System.out.println("> ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();	// 1, 42, 98, 8, 2, 33 (콤마로 연결되어 있는 6개의 숫자)
		scan.close();
		
		//입력값을 콤마를 기준으로 분리
		String[] values = input.split(",");
		
		//로또 번호의 데이터 타입과 동일한 데이터 타입으로 변경 (String[] -> int[])
		int[] userInputNumbers = new int[6];
		for (int i = 0; i < values.length; i++) {
			userInputNumbers[i] = Integer.parseInt(values[i].trim());
		}
		System.out.println(Arrays.toString(userInputNumbers));
		
		// 사용자 입력 데이터를 담고 있는 배열의 값을 정렬
		Arrays.sort(userInputNumbers);
		System.out.println(Arrays.toString(userInputNumbers));
		
		// 정렬된 결과를 출력
		System.out.print(">> 선택번호: ");
		for(int no : userInputNumbers) {
			System.out.printf("%2d  ", no);
		}
		System.out.println();
		
		// 로또 번호 생성 -> 정렬 -> 출력
		// 로또 번호를 저장하는 배열을 정의
		int[] lottoNumbers = new int[6];
		
		for (int i = 0; i < lottoNumbers.length; i++) {
			// i번째에 추가할 랜덤 넘버를 생성
		int num = (int) (Math.random() * 45) + 1;
		// 동일한 번호가 생성되었는지 체크
		// 로또 번호와 사용자 입력을 비교 -> 결과를 출력

		}
	}

}
