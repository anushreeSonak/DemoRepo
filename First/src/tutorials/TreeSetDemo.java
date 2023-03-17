package tutorials;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("C");
		System.out.println(treeSet);//print element in ordered form
		System.out.println(treeSet.contains("C"));
		treeSet.remove("A");
		System.out.println(treeSet);
	}

}
