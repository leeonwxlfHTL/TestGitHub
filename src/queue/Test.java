package queue;

public class Test {

	public static void main(String[] args) {
		ArrayQueue aq = new ArrayQueue(10);
		
		aq.enqueue(1);
		aq.enqueue(3);
		aq.enqueue(4);
		aq.enqueue(2);
		aq.enqueue(8);
		
		System.out.println("Front:" + aq.front());
		
		aq.dequeue();
		
		System.out.println("All:");
		aq.display();
		
		aq.enqueue(9);
		
		aq.dequeue();
		aq.dequeue();
		
		System.out.println("All2:" );
		aq.display();

	}

}
