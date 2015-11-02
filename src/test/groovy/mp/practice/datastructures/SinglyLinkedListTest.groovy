package mp.practice.datastructures

import spock.lang.Specification

/**
 * Created by michael.poirier on 10/29/2015.
 */
class SinglyLinkedListTest extends Specification {

    def "New Singly Linked List has a size of 0"()
    {
        setup:
        def list = new SinglyLinkedList()

        when:
        def size = list.size()

        then:
        size == 0
    }

    def "When an object is added to the list, the size is 1"()
    {
        setup:
        def list = new SinglyLinkedList()

        when:
        list.add(new Object())

        then:
        list.size() == 1
    }

    def "When an object is added to the list, the list contains the object"()
    {
        setup:
        def list = new SinglyLinkedList()
        def object = new String("s1")

        when:
        list.add(object)

        then:
        list.contains(object)
    }

    def "When an object is not added to the list, the list does not contain the object"()
    {
        setup:
        def list = new SinglyLinkedList()
        def object = new String("s1")

        expect:
        !list.contains(object)
    }
}
