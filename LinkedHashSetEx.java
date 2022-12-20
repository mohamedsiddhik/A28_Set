

package  set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx
{
    public static void main(String[] args) {

        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("Cricket");
        linkedHashSet.add("Football");
        linkedHashSet.add("Hockey");
        linkedHashSet.add("Volleyball");
        linkedHashSet.add("Golf");
        linkedHashSet.add("Golf");               // duplicate is not alloweded
        System.out.println(linkedHashSet.remove("Golf"));  // remove
        System.out.println(linkedHashSet);      // insertion order is maintained
    }
}