package queue;

public class ArrayQueue {

	private int capacity; // generelle Größe
	private int front;
	private int rear;
	private int[] queue;

	public ArrayQueue(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}
	
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(rear == capacity) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int element) {
		if(!isFull()) {
			this.queue[rear] = element;
			rear++;
		}
		else {
			System.err.println("Queue is full!");
		}
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			for(int i = 0; i <rear-1; i++) {
				this.queue[i]=this.queue[i+1];
			}
			if(rear < capacity) {
				this.queue[rear] = 0;
			}
			rear--;
		}
		else {
			System.err.println("Queue is empty!");
		}
	}
	
	public int front() {
		if(!isEmpty()) {
		return this.queue[front];
		}
		return -1; //keine saubere Lösung -> Exception Handling
	}
	
	public void display() {
		if(!isEmpty()) {
			for(int i = 0; i <rear; i++) {
				System.out.println(this.queue[i]);
			}
		}
		else {
			System.out.println("Queue is empty!");
		}
	}


}
