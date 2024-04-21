package queue;


public class ArrayQueue {

	private int capacity; // Generelle Größe
	private int front; // Index des vordersten Elements
	private int rear; // Index des hintersten Elements
	private int[] queue; // Das Array, das die Elemente der Queue speichert

	
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
		return front == rear;
	}

	
	public boolean isFull() {
		return rear == capacity;
	}

	/**
	 * Adds an element to the rear of the queue.
	 *
	 * @param element the element to be added to the queue
	 */
	public void enqueue(int element) {
		if (!isFull()) {
			this.queue[rear] = element;
			rear++;
		} else {
			System.err.println("Queue is full!");
		}
	}

	/**
	 * Removes the element from the front of the queue.
	 */
	public void dequeue() {
		if (!isEmpty()) {
			for (int i = 0; i < rear - 1; i++) {
				this.queue[i] = this.queue[i + 1];
			}
			if (rear < capacity) {
				this.queue[rear] = 0;
			}
			rear--;
		} else {
			System.err.println("Queue is empty!");
		}
	}

	/**
	 * Returns the element at the front of the queue without removing it.
	 *
	 * @return the element at the front of the queue, or -1 if the queue is empty
	 */
	public int front() {
		if (!isEmpty()) {
			return this.queue[front];
		}
		return -1; // Keine saubere Lösung -> Exception Handling
	}

	/**
	 * Displays all elements of the queue.
	 */
	public void display() {
		if (!isEmpty()) {
			for (int i = 0; i < rear - 1; i++) {
				System.out.println(this.queue[i]);
			}
		} else {
			System.err.println("Queue is empty!");
		}
	}
}