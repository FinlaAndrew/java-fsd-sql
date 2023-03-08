package hashmap;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>map = new HashMap<>();
		map.put("Finla", 23);
		map.put("Eira", 6);
		map.put("Erica", 1);
		
		int age=map.get("Erica");
		System.out.println("Age of Erica: "+age);
		
		boolean containFinla = map.containsKey("Prince");
		System.out.println("Hashmap contains Prince: "+containFinla);
		
		boolean containsFinla = map.containsKey("Eira");
		System.out.println("Hashmap contains Prince: "+containsFinla);
		
	
		
		map.remove("Finla");
		System.out.println("Finla has been removed");
		System.out.println("updated list : "+map);
		
		for(String name:map.keySet()) {
			int value = map.get(name);
			System.out.println(name+" is "+value+" years old");
		}
		
	}

}
