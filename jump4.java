public class jump4 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.print("Number:");
		
		int sum = 0;
		for(int i=1; i<=N; i++) {
			if (i % 4 == 0) {
			continue;
			}
			sum += (i * i);
		    }
		System.out.print(sum + " ");
		
}