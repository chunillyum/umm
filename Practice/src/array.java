
public class array {

	public static void main(String[] args) {
		String [] coffes = { "아메리카노", "콜드브루", "카페라떼"};//배열 선언과 동시에 값 입력
//1번째 방법 포문	for (int i=0; i < coffes.length; i++) { //length 는 배열의 크기를 알아볼 수 있음
//			        System.out.println(coffes[i]); //coffes라는 배열의 값을 i(length)로 꺼내옴
//		}
		//--------------------------------
		for (String e : coffes) { //두번째 방법
			System.out.println(e + " 하나");//for each문, 
		}
//		------------------------------------------
//		System.out.println(coffes[2]);//배열 속 특정 값만 꺼내기
	}

}
