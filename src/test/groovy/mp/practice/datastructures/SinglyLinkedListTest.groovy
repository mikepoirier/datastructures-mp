package mp.practice.datastructures

import spock.lang.Specification

/**
 * Created by michael.poirier on 10/29/2015.
 */
class SinglyLinkedListTest extends Specification {

    SinglyLinkedList<String> list

    def setup()
    {
        list = new SinglyLinkedList<>()
    }

    def "New Singly Linked List has a size of 0"()
    {
        when:
        def size = list.size()

        then:
        size == 0
    }

    def "When an object is added to the list, the size is 1"()
    {
        when:
        list.add(new String("s1"))

        then:
        list.size() == 1
    }

    def "When an object is added to the list, the list contains the object"()
    {
        setup:
        def object = new String("s1")

        when:
        list.add(object)

        then:
        list.contains(object)
    }

    def "When an object is not added to the list, the list does not contain the object"()
    {
        setup:
        def object = new String("s1")

        expect:
        !list.contains(object)
    }

    def "When an object is removed from the list, the list no longer contains the object"()
    {
        setup:
        def object = new String("s1")
        list.add(object)

        when:
        list.remove(object)

        then:
        !list.contains(object)
    }
}
