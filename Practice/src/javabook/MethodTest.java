package javabook;

public class MethodTest {
// main 메소드 안에서 객체를 생성하여 출력
//	public static class myInfo {
//	    String name = "윤준용";
//	    String address = "서울특별시";
//	    int age = 25;
//	    int height = 178;
//	}
//
//	public static void main(String[] args) {
//	    myInfo info = new myInfo(); <<<이게 객체 생성
//
//	    System.out.println("이름: " + info.name);
//	    System.out.println("주소: " + info.address);
//	    System.out.println("나이: " + info.age);
//	    System.out.println("키: " + info.height);
//	}
	public static class myInfo {
		//이건 오버라이딩을 통한 코드량 감소(나 아직 오버라이딩 안 배움)(이거 지피티가 짜줌)
	    String name = "윤준용";
	    String address = "서울특별시";
	    int age = 25;
	    int height = 178;

	    @Override
	    public String toString() {
	        return "이름: " + name + "\n주소: " + address + "\n나이: " + age + "\n키: " + height;
	    }
	}

	public static void main(String[] args) {
	    myInfo info = new myInfo();

	    System.out.println(info.toString());
	}
}