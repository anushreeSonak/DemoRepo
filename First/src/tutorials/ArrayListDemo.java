package tutorials;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		List<Integer> arrayList = new ArrayList<Integer>(5);
		for(int i=0;i<=5;i++)
		{
			arrayList.add(i);
		}
		
		//printing elements
		System.out.println(arrayList);
		
		//remove element from index
		
		System.out.println(arrayList.remove(3));
		
		//printing element one by one
		
		for(int i=0; i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
			}
		}
 }






