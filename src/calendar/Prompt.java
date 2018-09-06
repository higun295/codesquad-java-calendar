package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		String PROMPT = "cal> ";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = 2017;

		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.println("YEAR> ");
			year = sc.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.println("MONTH");
			month = sc.nextInt();
			
			if (month == -1) {
				break;
			} else if (month > 12) {
				System.out.println("1부터 12까지의 수만 입력해주세요.");
				System.out.println();
				continue;
			}
			cal.printCalendar(year, month);
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
