import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment(8);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement(9);
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
