import java.util.Iterator;

public class starStar {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			for(int j=0; j<5;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		System.out.println("=========");
		
		for(int k=0; k<5; k++) {
			for (int y=5; y>k; y--) { 
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========");
		
		for(int q=0; q<10; q++) {
			for (int w=10; q<w; w--) {
				System.out.print("**");
			}
			System.out.println();
			for(int e=0; e<=q; e++) {
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int r=0; r<10; r++) {
			for (int t=1; t<10-r; t++) {
				System.out.print(" ");
			}
			for(int u=0; u<=r; u++) {
				System.out.print("**");
				
			}
			System.out.println();
		}
}
}