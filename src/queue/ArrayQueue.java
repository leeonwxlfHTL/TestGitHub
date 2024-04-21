package queue;

/**
 * A simple implementation of a queue using an array.
 */
public class ArrayQueue {

	private int capacity; // Generelle Größe
	private int front; // Index des vordersten Elements
	private int rear; // Index des hintersten Elements
	private int[] queue; // Das Array, das die Elemente der Queue speichert

	/**
	 * Constructs an empty queue with the specified capacity.
	 *
	 * @param capacity the capacity of the queue
	 */
	public ArrayQueue(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];
	}

	/**
	 * Returns the capacity of the queue.
	 *
	 * @return the capacity of the queue
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Sets the capacity of the queue.
	 *
	 * @param capacity the new capacity of the queue
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * Returns the index of the front element.
	 *
	 * @return the index of the front element
	 */
	public int getFront() {
		return front;
	}

	/**
	 * Sets the index of the front element.
	 *
	 * @param front the new index of the front element
	 */
	public void setFront(int front) {
		this.front = front;
	}

	/**
	 * Returns the index of the rear element.
	 *
	 * @return the index of the rear element
	 */
	public int getRear() {
		return rear;
	}

	/**
	 * Sets the index of the rear element.
	 *
	 * @param rear the new index of the rear element
	 */
	public void setRear(int rear) {
		this.rear = rear;
	}

	/**
	 * Returns the array representing the queue.
	 *
	 * @return the array representing the queue
	 */
	public int[] getQueue() {
		return queue;
	}

	/**
	 * Sets the array representing the queue.
	 *
	 * @param queue the new array representing the queue
	 */
	public void setQueue(int[] queue) {
		this.queue = queue;
	}

	/**
	 * Checks if the queue is empty.
	 *
	 * @return true if the queue is empty, false otherwise
	 */
	public boolean isEmpty() {
		return front == rear;
	}

	/**
	 * Checks if the queue is full.
	 *
	 * @return true if the queue is full, false otherwise
	 */
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