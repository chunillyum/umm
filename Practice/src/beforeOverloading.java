
public class beforeOverloading {
	

	public static int getPower(int number) {
		int result = number*number;
		return result;
		}
		public static int getGugu(int number, int exp) {
			int result = 1;
			for(int i = 0 ; i < exp; i++) {
				result *= number;
			}
			return result;
		}
	
		
	
	public static void main(String[] args) {
		System.out.println(getPower(5));
		System.out.println(getPower(3));
		System.out.println(getGugu(2, 9));


}
	}