package firstPackage;

import java.util.*;
public class Country 
{
	public static void main(String[] args) 
	{
		//Initialize ArrayList
		List<List<String>> paths = new ArrayList<>();
		
		// add array values
		paths.add(Arrays.asList("London", "New York"));
		paths.add(Arrays.asList("New York", "Lima"));
		paths.add(Arrays.asList("Lima", "Sao Paulo"));
		
		// Call FindDestination method
		
		String destination = findDestination(paths);
		
		//Print destination City
		System.out.println(destination);
	}

	
	public static String findDestination(List<List<String>> paths) 
	{
		//Declare set variable
		Set<String> startCities = new HashSet<>();
		Set<String> endCities = new HashSet<>();
		
		//Iterate array
		for (List<String> path : paths) 
		{
			startCities.add(path.get(0));
			endCities.add(path.get(1));
		}
		for(String endCity : endCities)
		{
			if (!startCities.contains(endCity))
			{
				return endCity;

			}
		}
		
		//if not matched city return Null
		return null;
	}
}
