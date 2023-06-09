package lambda;

import java.util.*;
import java.util.HashMap;
import java.util.function.Function;

public class BuiltInFunction {
	
	private static HashMap<Integer,String> Employee= new HashMap<>();
	public static void add(String name, int id) {
		if(!Employee.containsKey(id)) {
			Employee.put(id, name);
		}else {
			System.out.println("Employee already exist!!");
		}
		
	}
	
	public static void main(String[] args) {
		Function<Integer, String> get= (Integer id) -> {
			if(Employee.containsKey(id))return Employee.get(id);
			else
			   return "invalid id";
		};
		
		add("Riti", 100);
		add("Rathore", 101);
		add("Kochi", 102);
		add("Didi", 103);
		add("Vaishi", 104);
		add("Vaibh", 105);
		
		System.out.println("Id=101, Name="+ get.apply(101));
		
	}
	

}
