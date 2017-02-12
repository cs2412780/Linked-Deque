package deque;

/**
An class of deque whose entries stored in a deque.   
@author Liang Dong
@version 1.0
*/
public class Deque<T> implements DequeInterface<T>{
	
	
	private Node first;
	private Node last;
	private int numberOfEntries;
	
	public Deque(Node first, Node last) {
		this.first = first;
		this.last = last;
		numberOfEntries = 0;
	}
	
	public Deque() {
		this(null, null);
	}

	
	// Node contains data field and a reference to another node.
	private class Node {
		private T data;
		private Node previous;
		private Node next;
			
		/**
		 * constructor that initiates the member fields.
		 * @param data the data
		 * @param next the previous node
		 * @param next the next node
		 */
		private Node(Node previous, T data, Node next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}
		/**
		 * getData is a accessor method
		 * @return the data field
		 */
		private T getData() {
			return data;
		}
			
		/**
		 * a mutator method
		 * @param data the data field
		 */
		private void setData(T data) {
			this.data = data;
		}
		
		/**
		 * a accessor method
		 * @return the previous node.
		 */
		private Node getPreviousNode() {
			return previous;
		}
			
		/**
		 * a mutator method
		 * @param next the previous node.
		 */
		private void setPreviousNode(Node previous) {
			this.previous = previous;
		}
			
		/**
		 * a accessor method
		 * @return the next node.
		 */
		private Node getNextNode() {
			return next;
		}
			
		/**
		 * a mutator method
		 * @param next the next node.
		 */
		private void setNextNode(Node next) {
			this.next = next;
		}
			
	}// end Node
	

	/**
	 * Add a new entry to the front.
	 * @param newEntry The object to be added as a new entry.
	 */
	@Override
	public void addToFront(T newEntry) {
		Node newNode = new Node(null, newEntry, first);
		if(isEmpty()) {
			last = newNode;
		}
		else {
			first.setPreviousNode(newNode);
		}
		first = newNode;
		numberOfEntries++;
	}// end addToFront

	
	/**
	 * Add a new entry to the back.
	 * @param newEntry The object to be added as a new entry.
	 */
	@Override
	public void addToBack(T newEntry) {
		Node newNode = new Node(last, newEntry, null);
		if(isEmpty()) {
			first = newNode;
		}
		else {
			last.setNextNode(newNode);
		}
		last = newNode;
		numberOfEntries++;		
	}// end addToBack

	/**
	 * Removes and returns the front entry of this deque.
	 * @return The object at the front of this deque.
	 * @throws EmptyQueueException if the deque is empty before this operation.
	 */
	@Override
	public T removeFromFront() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else {
			T temp = first.getData();
			first.setData(null);
			first = first.getNextNode();
			numberOfEntries--;
			return temp;
		}
	}//end removeFromFront

	
	/**
	 * Removes and returns the back entry of this deque.
	 * @return The object at the back of this deque.
	 * @throws EmptyQueueException if the deque is empty before this operation.
	 */
	@Override
	public T removeFromBack() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else {
			T temp = last.getData();
			last.setData(null);
			last = last.getPreviousNode();
			numberOfEntries--;
			return temp;
		}
	}// end removeFromBack

	/**  Retrieves the entry at the front of this deque.
	   @return  The object at the front of the deque.
	   @throws  EmptyQueueException if the deque is empty. 
	 */
	@Override
	public T getFront() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else {
			return first.getData();
		}
	}// end getFront

	/**  Retrieves the entry at the front of this deque.
	   @return  The object at the front of the deque.
	   @throws  EmptyQueueException if the deque is empty. 
	 */
	@Override
	public T getBack() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else {
			return last.getData();
		}
	}// end getBack

	/** Detects whether this queue is empty.
	   @return  True if the queue is empty, or false otherwise. 
	 */
	@Override
	public boolean isEmpty() {
		return numberOfEntries <= 0;
	}// end isEmpty

	/** Removes all entries from this queue. */

	@Override
	public void clear() {
		while(!isEmpty()) {
			removeFromFront();
		}
		
	}// end clear
	

}// end Deque
