
public class method {
//	public static String sayHello() {
//		return ("Hi, I'm method");
//	}
//	
//
//	public static void main(String[] args) {
//		System.out.println(sayHello()+" i'm groot");
//	}

	 public static void power(int number) {
		 int result = number * number;
		 System.out.println(number + "의 2승은 " + result);
	 }
	 
	 public static void powerByExp(int number, int exponent) {
		 int result = 1;
		 for (int i = 0; i < exponent; i++) {
			 result *= number;
		 }
		 System.out.println(number+"의 "+exponent+"승은 "+result);

	 }
	 
	 public static void main(String[] args) {
		 power(3);
		 System.out.println("========");
		 powerByExp(3, 3);

	 }
	 
}
