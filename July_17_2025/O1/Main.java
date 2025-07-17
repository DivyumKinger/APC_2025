package July_17_2025.O1;

import java.util.*;

class Main {
	public static void main(String[] args) {
		Map<String, Double> tempMap = new HashMap<>();
		
		tempMap.put("Delhi", 34.5);
		tempMap.put("Mumbai", 31.0);
		tempMap.put("Bangalore", 28.4);
		
		Set<Map.Entry<String, Double>> entrySet = tempMap.entrySet();
		for (Map.Entry<String, Double> es : entrySet) {
			System.out.println("Key: " + es.getKey() + " | Value: " + es.getValue());
		}
		
		tempMap.forEach((k, v) -> System.out.println("key " + k + " value " + v));
		
		System.out.println(tempMap.containsKey("HYD"));
		
		tempMap.putIfAbsent("HYD", 39.0);
		
		Double t = tempMap.get("HYD");
		System.out.println(t);
		
		t = tempMap.getOrDefault("KOL", -1.0);
		System.out.println(t);
	}
}