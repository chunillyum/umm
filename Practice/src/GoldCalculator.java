
import java.util.Scanner;

public class GoldCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("현재의 골드 시세를 입력하세요 (골드:금액 형태로 입력해주세요): ");
        String goldPriceInput = scanner.nextLine();
        String[] goldPriceParts = goldPriceInput.split(":");
        int goldAmount = Integer.parseInt(goldPriceParts[0].trim());
        int goldPrice = Integer.parseInt(goldPriceParts[1].trim());
        
        System.out.print("필요한 골드 또는 지불할 돈을 입력하세요: ");
        int amount = scanner.nextInt();
        
        double calculatedAmount;
        
        if (goldAmount != 0 && goldPrice != 0) {
            calculatedAmount = (double) amount / goldPrice * goldAmount;
        } else {
            calculatedAmount = 0;
        }
        
        System.out.println("계산된 결과: " + calculatedAmount);
    }
}
//test!!!
//testsd
//teeeest`
