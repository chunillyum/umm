import java.util.Scanner;


public class playLand {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("신분증을 보여주세요");
		String age=scanner.nextLine();
		int charge = 0;
		
		if (Integer.parseInt(age)<=14) {//(Integer.parseInt 문자열 속 정수를 뽑아 int로 형변환
			charge=1000;
			System.out.println("어린이입니다. 요금은" + charge + "원 입니다.");
		}
		else if (Integer.parseInt(age)<=19) {
			charge=1800;
			System.out.println("청소년입니다. 요금은" + charge + "원 입니다.");
		}
		else if (Integer.parseInt(age)>=20) {
			charge=2500;
			System.out.println("성인입니다. 요금은" + charge + "원 입니다.");
		}

	}

}
