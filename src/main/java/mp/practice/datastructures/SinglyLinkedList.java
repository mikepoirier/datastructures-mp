package mp.practice.datastructures;

/**
 * SinglyLinkedList
 *
 * @author Mike Poirier
 */
public class SinglyLinkedList<T> {

	private SinglyLinkedListNode<T> head;
	private SinglyLinkedListNode<T> tail;
	private int size;

	public SinglyLinkedList() {
		head = new SinglyLinkedListNode<T>();
		tail = head;
	}

	public int size()
	{
		return size;
	}

	public void add(T object)
	{
		if(tail.getData() == null)
		{
			tail.setData(object);
		} else
		{
			tail.setNext(new SinglyLinkedListNode<T>());
			tail = tail.getNext();
			tail.setData(object);
		}
		size++;
	}

	public boolean contains(T object)
	{
		SinglyLinkedListNode node = head;

		if(size() == 0) return false;

		if(node.getData().equals(object)) return true;

		while((node = node.getNext()) != null)
		{
			if(node.getData().equals(object)) return true;
		}

		return false;
	}

	public boolean remove(T object)
	{
		if(this.size() == 0)
		{
			return false;
		}
		SinglyLinkedListNode<T> node = head;

		// If root has it
		if(node.getData().equals(object))
		{
			head = node.getNext();
			size--;
			return true;
		}

		while(node.getNext() != null)
		{
			if(node.getNext().getData().equals(object))
			{
				node.setNext(node.getNext().getNext());
				size--;
				return true;
			}

			if(node.getNext() == null) break;
		}
		return false;
	}
}
