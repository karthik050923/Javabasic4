import java.util.Scanner;

public class jump2 {
   public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.print("Number:");
		for(int i=0; i<=N; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
		    continue;
			}
			System.out.print(i + " ");
		    }
        }
}
