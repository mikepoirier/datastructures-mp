package mp.practice.datastructures;

/**
 * SinglyLinkedList
 *
 * @author Mike Poirier
 */
public class SinglyLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public SinglyLinkedList() {
		head = new Node();
		tail = head;
	}

	public int size()
	{
		return size;
	}

	public void add(Object object)
	{
		if(tail.getData() == null)
		{
			tail.setData(object);
		} else
		{
			tail.setNext(new Node());
			tail = tail.getNext();
			tail.setData(object);
		}
		size++;
	}

	public boolean contains(Object object)
	{
		Node node = head;

		if(size() == 0) return false;

		if(node.getData().equals(object)) return true;

		while((node = node.getNext()) != null)
		{
			if(node.getData().equals(object)) return true;
		}

		return false;
	}
}
