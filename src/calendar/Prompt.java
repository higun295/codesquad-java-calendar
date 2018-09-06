package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		String PROMPT = "cal> ";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;

		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.println(PROMPT);
			month = sc.nextInt();
			if (month == -1) {
				break;
			} else if (month > 12) {
				System.out.println("1부터 12까지의 수만 입력해주세요.");
				System.out.println();
				continue;
			}
			cal.printCalendar(2018, 9);
		}

		System.out.println("Bye~");
		sc.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
