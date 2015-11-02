package mp.practice.datastructures;

/**
 * AbsNode
 *
 * @author Mike Poirier
 */
public abstract class Node<T> {
	protected T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
