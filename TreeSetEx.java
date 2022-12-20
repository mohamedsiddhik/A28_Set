

package  set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx
{
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(42);
        treeSet.add(4);
        treeSet.add(35);
        treeSet.add(17);
        treeSet.add(23);
        treeSet.add(-5);
        System.out.println("Elements are sorted on ascending order : " + treeSet);
        System.out.println("First Element : " + treeSet.first());
        System.out.println("last Element : " + treeSet.last());
        System.out.println("Value lesser than given value : " + treeSet.headSet(17));
        System.out.println("Value Equal to and higher of given value : " + treeSet.tailSet(17));
        System.out.println("Subset values : " + treeSet.subSet(1,35));
        System.out.println("Higher : " + treeSet.higher(35));
        System.out.println("Lower : " + treeSet.lower(1));
        System.out.println("Poll First : " + treeSet.pollFirst());
        System.out.println("Poll last : " + treeSet.pollLast());
        System.out.println("After Polling : " + treeSet);
        System.out.println("Descending order : " + treeSet.descendingSet());

        // Iterate
        Iterator <Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------descending--------------");
        Iterator <Integer> descIterator = treeSet.descendingIterator();
        while (descIterator.hasNext())
            System.out.println(descIterator.next());




    }
}