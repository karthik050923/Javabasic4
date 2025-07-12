import java.util.Scanner;

public class jump3 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.print("Number:");
		for(int i=1; i<=N; i++) {
			if (i % 2 == 0) {
		    continue;
			}
			System.out.print(i + " ");
		    }

        // for(int i=1; i<=N; i++) {
		// 	if (i % 2 == 0) {
		//     continue;
		// 	}
		// 	System.out.print(i + " ");
		//     }
    }
}
