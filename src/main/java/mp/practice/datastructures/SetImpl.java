package mp.practice.datastructures;

/**
 * SetImpl
 *
 * @author Mike Poirier
 */
public class SetImpl<T> {

	public static final int SIZE = 16;
	private SinglyLinkedList[] data = new SinglyLinkedList[SIZE];

	public SetImpl() {
		for(int i = 0; i < SIZE; i++)
		{
			data[i] = new SinglyLinkedList<T>();
		}
	}

	public int size()
	{
		int size = 0;
		for(SinglyLinkedList list : data)
		{
			size += list.size();
		}
		return size;
	}

	public void add(T object)
	{
		((SinglyLinkedList<T>)data[hash(object)]).add(object);
	}

	public boolean contains(T object)
	{
		for(SinglyLinkedList list : data)
		{
			if(list.contains(object)) return true;
		}
		return false;
	}

	private int hash(Object object)
	{
		return object.hashCode() % SIZE;
	}

}
