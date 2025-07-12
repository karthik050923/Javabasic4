import java.util.Scanner;
public class jump1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1; i<=N; i++) {
			if (i % 5 == 0) {
		    break;
            }
            System.out.print(i + " ");
        }
    }
}
