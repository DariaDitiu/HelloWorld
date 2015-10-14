
public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
		greeting();
	}
	
	private static void greeting() {
		System.out.println("Hello and welcome!");
		
	}

	private static void displayGreeting(){
		System.out.println("hello happy sales people!");
		System.out.println("thios app shows sales data");
					
	}

}
