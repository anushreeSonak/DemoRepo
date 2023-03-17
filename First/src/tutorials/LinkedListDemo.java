package tutorials;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<String>();
		 list.add("A");
		 list.add("B");
		 list.addLast("c");
		 list.addFirst("D");
		 list.add(2,"E");
		 System.out.println(list);
		 list.remove("B");
		 list.removeFirst();
		 list.removeLast();
		 System.out.println(list);
		 }

	}


