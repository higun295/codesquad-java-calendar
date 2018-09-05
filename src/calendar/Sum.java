package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println(a + "와 " + b + "의 합은 " + c + " 입니다.");
		
		sc.close();
	}
}
