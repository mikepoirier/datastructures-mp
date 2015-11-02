package mp.practice.datastructures

import spock.lang.Specification

/**
 * Created by michael.poirier on 10/29/2015.
 */
class SinglyLinkedListNodeTest extends Specification {

    SinglyLinkedListNode<String> node

    def setup()
    {
        node = new SinglyLinkedListNode<>();
    }

    def "Node data is null on First Instantiation"()
    {
        when:
        def result = node.getData()

        then:
        result == null
    }

    def "Node next is null on first instantiation"()
    {
        when:
        def result = node.getNext()

        then:
        result == null
    }

    def "When setting node data then getData returns data"()
    {
        setup:
        def data = new String("s1")

        when:
        node.setData(data)

        then:
        data.equals(node.getData())
    }

    def "When setting node next then getNext returns next"()
    {
        setup:
        def next = new SinglyLinkedListNode<String>()

        when:
        node.setNext(next)

        then:
        next.equals(node.getNext())
    }
}
