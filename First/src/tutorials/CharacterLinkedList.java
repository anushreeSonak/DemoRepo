package firstPackage.First.src.tutorials;

import java.util.LinkedList;

public class CharacterLinkedList {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Anushree");
        ll.add("Vikrant");
        ll.add("Kanchan");
        ll.add("Revati");
        System.out.println("Initial list of elements: " + ll);
        //Removing specific element from arraylist
        ll.remove("Vijay");
        System.out.println("After invoking remove(object) method: " + ll);
    }
}