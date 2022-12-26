package test;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		System.out.println("> 1부터 45 사이의 6개의 숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String[] userNumber = scan.nextLine().split(",");
		scan.close();
		int[] number = new int[6];

		for (int i = 0; i < userNumber.length; i++) {
			number[i] = Integer.parseInt(userNumber[i]);
		}
		Arrays.sort(number);

		int[] rightNumber = new int[6];
		for (int i = 0; i < rightNumber.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			rightNumber[i] = num;
		}
		Arrays.sort(rightNumber);

		int count = 0;

		for (int i = 0; i < userNumber.length; i++) {
			for (int j = 0; j < rightNumber.length; j++) {
				if (number[i] == rightNumber[j]) {
					count++;

				}
			}
		}

		if (count == 0) {
			System.out.println("다 틀렸어요ㅠㅜ");
		} else if (count == 1) {
			System.out.println("1개밖에 맞추지 못하셨네요. 아쉬워요!");
		} else if (count == 2) {
			System.out.println("2개 맞으셨습니다. 분발하세요~");
		} else if (count == 3) {
			System.out.println("3개가 일치하므로 당첨되지 않았습니다.");
		} else if (count == 4) {
			System.out.println("3등 당첨!");
		} else if (count == 5) {
			System.out.println("2등 당첨!!");
		} else if (count == 6) {
			System.out.println("1등 당첨!!!");
		}

	}

}