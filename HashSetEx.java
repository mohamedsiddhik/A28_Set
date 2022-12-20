

package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx
{
    public static void main(String[] args) {

        HashSet<String> hash = new HashSet<>();
        hash.add("Hi");
        hash.add("Hello");
        hash.add("Learning");
        hash.add(null);
        hash.add("Java");
        hash.add(null);           //Null values are allowed
        hash.add("Java");        // does not allowed duplicate
        System.out.println(hash);
        hash.remove(null);
        System.out.println("Removed : " + hash);
        System.out.println(hash.contains("Hi"));
        System.out.println(hash.isEmpty());

        // iterate
        System.out.println("--------------------------");
        Iterator<String> iterator = hash.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}