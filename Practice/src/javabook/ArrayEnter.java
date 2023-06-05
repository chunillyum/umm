package javabook;
import java.util.Scanner;
public class ArrayEnter { //지피티 코드 입맛대로 바꾸기
	//class에 속한 배열의 값을 검사해서 입력값이 배열 속 값에 해당이 안 되면 ㅗ 를 출력
	static Scanner sc = new Scanner(System.in);
	static class MyLife{
		static String[] getMyFriends() {
			String[] eleFriends = {"hobin", "dongwoo"};
			return eleFriends;
	}
	}
	public static void main(String[] args) {
		System.out.println("enter your name");
		String heName = sc.nextLine();
		heName = heName.replaceAll("\\s+", "");
		boolean isFriends = false;
		for (String friends : MyLife.getMyFriends()) {
			if(friends.equals(heName)) {
				isFriends = true;
				break;
			}
		}
		if(isFriends) {
			System.out.println("Hi blacknut");
		}
		else {
			System.out.println("you are not my elefriends");
		}
		
	}

}
