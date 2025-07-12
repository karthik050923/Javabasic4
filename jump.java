public class jump {
    public static void main(String[] args) {
		for(int item=1; item<=10; item++) {
			if (item == 10) {
				System.out.println("Item " + item + " found, Stopping the search.");
				break;
			}
			System.out.println("Checking item " + item);
		}
	}
}
