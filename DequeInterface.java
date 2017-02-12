package deque;


/**
An interface for the ADT deque.   
@author Liang Dong
@version 1.0
*/
public interface DequeInterface<T> {
	
	/**
	 * Add a new entry to the front.
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addToFront(T newEntry);
	
	/**
	 * Add a new entry to the back.
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addToBack(T newEntry);
	
	/**
	 * Removes and returns the front entry of this deque.
	 * @return The object at the front of this deque.
	 * @throws EmptyQueueException if the deque is empty before this operation.
	 */
	public T removeFromFront();
	
	/**
	 * Removes and returns the back entry of this deque.
	 * @return The object at the back of this deque.
	 * @throws EmptyQueueException if the deque is empty before this operation.
	 */
	public T removeFromBack();

	
	/**  Retrieves the entry at the front of this deque.
	   @return  The object at the front of the deque.
	   @throws  EmptyQueueException if the deque is empty. 
	 */
	public T getFront();
	
	/**  Retrieves the entry at the front of this deque.
	   @return  The object at the front of the deque.
	   @throws  EmptyQueueException if the deque is empty. 
	 */
	public T getBack();
	
	/** Detects whether this queue is empty.
	   @return  True if the queue is empty, or false otherwise. 
	 */
	public boolean isEmpty();
	
	/** Removes all entries from this queue. */

	public void clear();
}// end DequeInterface
