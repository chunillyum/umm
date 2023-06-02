package javabook;

//String path = JOptionPane.showInputDialog("Enter a path");
public class areYouMyFriend {
	static String info = "hi";//info라는 변수를 전역변수로 설정. 어느 클래스에서나 사용 가능
	static class eleSchool {//배열을 담는 첫번째 클래스
		String hometown[] = {"hanbit", "hobin", "dongwoo", "dongman", "chanyang"}; {
		for(String friends : hometown) {
			System.out.println(friends);
		}
	}
}
	static class middleSchool{
		String hometown[] = {"minjun", "jaewoong", "hyenwoo", "jaeho"}; {
			for(String friends : hometown) {
				System.out.println(friends);
			}
		}
	}
	static class highSchool{
		String hometown[] = {"sicksick", "jaesung" }; {
		for(String friends : hometown) {
			System.out.println(friends);
		}
	}
	public static void main(String[] args) {
		eleSchool allTeen =  new eleSchool();
		middleSchool overTen  = new middleSchool();
		highSchool overFive  = new highSchool();
		System.out.println(info);//메인 메소드 안에 객체 생성만 했을 뿐인데 실행되는 이유
		//추측컨데 위 클래스들 안에 sysout이 들어가있어서가 아닐까?
//		System.out.println(allTeen.hometown); //이것부턴 [Ljava.lang.String;라는 오류가 뜨는데
		//왜인지 모르겠음. 내가 생각한 건 
		//(eleSchool allTeen =  new eleSchool(); 이렇게 객체 생성 이후 변수에 담아서
		//allTeen이라는 변수 안에 있는 homeTown 배열의 값이 나오길 기대했는데 ㅜ
//		System.out.println(overTen.hometown);
//		System.out.println(overFive.hometown);
		
	}
	}
	
}



