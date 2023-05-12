package data_structures;

import java.util.HashMap;

public class HashSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jahnavi", 19);
        hashMap.put("Venkat", 32);
        hashMap.put("Sachin", 21);
        hashMap.put("Steve", 28);

        String key = "Steve";
        if (hashMap.containsKey(key)) {
            int value = hashMap.get(key);
            System.out.println("Value for key '" + key + "' found: " + value);
        } else {
            System.out.println("Key '" + key + "' not found.");
        }

	}

}
