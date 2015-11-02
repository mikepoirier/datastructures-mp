package mp.practice.datastructures;

/**
 * Node
 *
 * @author Mike Poirier
 */
public class SinglyLinkedListNode<T> extends Node<T> {

	private SinglyLinkedListNode<T> next;

	public SinglyLinkedListNode<T> getNext()
	{
		return next;
	}

	public void setNext(SinglyLinkedListNode<T> next) {
		this.next = next;
	}
}
