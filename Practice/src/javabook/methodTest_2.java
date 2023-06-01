package javabook;
import java.util.Scanner;
public class methodTest_2 {
	static Scanner sc = new Scanner(System.in);
	
	 //main 메소드 안에서 객체를 생성하여 출력
		public static class myInfo {
		    String name = "윤준용";
		    String address = "서울특별시";
		}
		
	public static void main(String[] args) {
	    myInfo mInfo = new myInfo(); //<<<이게 객체 생성/사용할 때 변수이름.객체의 주소 속 변수로 부름
		//
	    System.out.println("이름을 입력해주세요");
	    String name = sc.nextLine();
	    System.out.println("어디 사시나요?");
	    String address = sc.nextLine();
	    address = address.replaceAll("\\s+", "");
	    if(address.trim().equals(mInfo.address)) {//.trim() = 입력한 문자열의 공백 제거
	    	System.out.println("우와! " + name + "님! " + mInfo.name + "과 같은 "
	    			+ mInfo.address + "에 사시는군요!");
	    }
	    
	}

}
