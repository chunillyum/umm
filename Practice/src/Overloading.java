
public class Overloading {
	
	public static int getPower(int number) {
		int result = number*number;
		return result;
		}
	
	public static int getPower(String strNumber) {
		int number = Integer.parseInt(strNumber);
		return number*number;
	}
	
	
		public static int getPower(int number, int exp) {
			int result = 1;
			for(int i = 0 ; i < exp; i++) {
				result *= number;
			}
			return result;
		}

	public static void main(String[] args) {
		System.out.println(getPower("4"));
		System.out.println(getPower(3));
		System.out.println(getPower(2,9));
		//메소드 오버로딩
		//전달값의 타입, 갯수가 다르면 같은 이름의 메소드를 사용할 수 있음
		
	}

}
