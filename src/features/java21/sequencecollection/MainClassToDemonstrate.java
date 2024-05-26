package features.java21.sequencecollection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainClassToDemonstrate {

    public static void main(String[] args) {
        var list = new ArrayList<Employee>();
        var pushpank = new Employee("pushpank", BigDecimal.valueOf(20000), "location 1 of hamburg");
        var nitesh = new Employee("nitesh", BigDecimal.valueOf(30000), "location 2 of indore");
        var akshita = new Employee("akshita", BigDecimal.valueOf(50000), "location 3 of up");

        list.addAll(List.of(pushpank, nitesh, akshita));

        System.out.println(list);

        /**
         * As we know list is ordered collection we always knows what's the value of index 0 but lets suppose I don't know the collection type
         * How can I fetch firstElement? lastElement?
         * How can I add at first index and last index?
         * How can I remove from first and last index?
        *  */

        /**
         * that's what SequencedCollection is supposed to do
         * @class
         * interface SequencedCollection<E> extends Collection<E> {
         *   // new method
         *   SequencedCollection<E> reversed();
         *   // methods promoted from Deque
         *   void addFirst(E);
         *   void addLast(E);
         *   E getFirst();
         *   E getLast();
         *   E removeFirst();
         *   E removeLast();
         * }
         *
         * */
        System.out.println(list.getLast());
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
