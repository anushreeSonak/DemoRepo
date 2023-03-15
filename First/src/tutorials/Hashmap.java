package tutorials;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		System.out.println("Size of the Map is: " + map.size());
		System.out.println(map);

	}

}
