package deque;

public class App {

	public static void main(String[] args) {
		Deque<Integer> deque = new Deque<>();
		
		for(int i = 0; i < 10; i++) {
			deque.addToBack(i);
		}
		
		System.out.println("Front: " + deque.getFront());
		System.out.println("Back: " + deque.getBack());
		
		for(int i = 0; i < 2; i++) {
			deque.removeFromBack();
		}
		
		//deque.clear();
		System.out.println("Front: " + deque.getFront());
		System.out.println("Back: " + deque.getBack());

	}

}
