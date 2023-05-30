//import java.util.Scanner;
//
//	public class gold {
//	    public static void main(String[] args) {
//	        int goldPerUnit = 100; // 1골드당 금액 (60원)
//	        
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.print("지불할 금액을 입력하세요: ");
//	        int payment = scanner.nextInt(); // 지불할 금액 입력
//	        
//	        double goldAmount = (double) payment / goldPerUnit; // 골드 양 계산
//	        
//	        System.out.println("얻을 수 있는 골드: " + goldAmount);
//	    }
//	}
	

	public class gold {
	    public static void main(String[] args) {
	        int goldPerUnit = 100; // 1골드당 금액 (60원)
	        
	        giveMeGold = new giveMeGold(100,000) {
	        System.out.print("지불할 금액을 입력하세요: ");
	        int payment = giveMeGold(); // 지불할 금액 입력
	        
	        double goldAmount = (double) payment / goldPerUnit; // 골드 양 계산
	        
	        System.out.println("받게 될 골드: " + goldAmount);
	        }
	    }
	}
	    
	    




