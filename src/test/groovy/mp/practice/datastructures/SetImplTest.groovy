package mp.practice.datastructures

import spock.lang.Specification

/**
 * Created by michael.poirier on 10/29/2015.
 */
class SetImplTest extends Specification {

    private SetImpl set

    def setup()
    {
        set = new SetImpl()
    }

    def "Size is 0 when set is first instantiated"()
    {
        when:
        def set = new SetImpl()

        then:
        set.size() == 0
    }

    def "Size is 1 when an object is added to set"()
    {
        when:
        set.add(new String("s1"))

        then:
        set.size() == 1
    }

    def "When an object is added to a set then set contains object is true"()
    {
        setup:
        def obj = new String("s1")

        when:
        set.add(obj)

        then:
        set.contains(obj)
    }
}
