package Crowd;

import java.util.TreeMap;

public class TreeMap_1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();

		map.put(100, "hi");
		map.put(2, "Hello");
		map.put(3, "GoodMorning");
		map.put(14, "Afternioin");
		map.put(15, "GoodNight");
		System.out.println(map);
		//if key exists ok. otherwise it returns the greater key
		System.out.println("Check the key " + map.ceilingKey(4));
		
		//here if key exists ok.it returns key the greater key value pair as----{3=Goodmorning}
		System.out.println("Check the Celingentry " + map.ceilingEntry(3));
		
		// Always returns the value greater than given key                                              
		System.out.println("Check the  higherentry " + map.higherEntry(4));
		System.out.println("Check the higherentry " + map.higherEntry(5));

		// follows sorting bcz of treee map
		System.out.println("Check the Firstentry " + map.firstKey());
		
		// here it prints the last entry in the map bcz its Sorted
		System.out.println("Check the Lastentry " + map.lastEntry());

	}

}
