package ProductsAssignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadProducts {
	
	BufferedReader reader;
	
	public ReadProducts(String inputFile) throws FileNotFoundException {
		FileReader fileReader= new FileReader(inputFile);
		reader= new BufferedReader(fileReader);
	}
	
	public List<Products> readAll() {
		List<Products> l= new ArrayList<>();
		
		String str="";
		try {
			while((str=reader.readLine())!=null) {
				StringTokenizer tokens= new StringTokenizer(str,",");
				String name= tokens.nextToken();
				int id= Integer.parseInt(tokens.nextToken());
				float price= Float.parseFloat(tokens.nextToken());
				boolean isA= Boolean.parseBoolean(tokens.nextToken());
				
				l.add(new Products(name,id,price,isA));
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		ReadProducts rp= new ReadProducts("D:\\WTraining\\java_concepts\\wiley_core_java\\data\\products.csv");
		
		List<Products> list= rp.readAll();
		
		for(Products p: list) {
			System.out.println("name:"+p.getProductName());
			System.out.println("id:"+p.getProductId());
			System.out.println("price:"+p.getPrice());
			System.out.println("isAvailable:"+p.isAvailable());
			System.out.println("------------------------------");
		}
		
		

	}

}
