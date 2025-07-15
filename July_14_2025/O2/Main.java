package July_14_2025.O2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@SuppressWarnings("ALL")
public class Main {
	public static void main(String[] args) {
		List<String> cityList = new CopyOnWriteArrayList<>();
		cityList.add("Bangalore");
		cityList.add("New Delhi");
		cityList.add("Pune");
		cityList.add("Hyderabad");
		if (cityList.contains("Pune")) {
			System.out.println("City found");
		} else  {
			System.out.println("City not found");
		}
		System.out.println(cityList.indexOf("Bangalore"));
		System.out.println("*** Using normal for loop ***");
		for (int n = 0; n < cityList.size(); n++) {
			System.out.println(cityList.get(n));
		}
		System.out.println("*** Using for each loop ***");
		for (String c: cityList) {
			System.out.println(c);
		}
		System.out.println("*** Using iterator ***");
		Iterator<String> itr = cityList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*** Using forEach ***");
		cityList.forEach(c -> System.out.println(c));
	}
}
