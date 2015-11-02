package mp.practice.datastructures

import org.junit.Assert
import spock.lang.Specification

/**
 * Created by michael.poirier on 10/29/2015.
 */
class NodeTest extends Specification {

    def "Node data is null on First Instantiation"()
    {
        setup:
        def node = new Node()

        when:
        def result = node.getData()

        then:
        result == null
    }

    def "Node next is null on first instantiation"()
    {
        setup:
        def node = new Node()

        when:
        def result = node.getNext()

        then:
        result == null
    }

    def "When setting node data then getData returns data"()
    {
        setup:
        def node = new Node()
        def data = new String("s1")

        when:
        node.setData(data)

        then:
        data.equals(node.getData())
    }

    def "When setting node next then getNext returns next"()
    {
        setup:
        def node = new Node()
        def next = new Node()

        when:
        node.setNext(next)

        then:
        next.equals(node.getNext())
    }
}
