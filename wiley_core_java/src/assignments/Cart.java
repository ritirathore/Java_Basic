package assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
//	List<Products> c= new ArrayList<>();
//	private ArrayList<Integer> pid=new ArrayList<Integer>();
//	private ArrayList<String> pname=new ArrayList<String>();
//	private ArrayList<String> ptype=new ArrayList<String>();
//	private ArrayList<Integer> qtypurchased=new ArrayList<Integer>();
//	private ArrayList<Float> price=new ArrayList<Float>();
//	
//	public ArrayList<Integer> getpid()throws IOException
//	{
//		return pid;
//	}
//	public ArrayList<String> getpname()throws IOException
//	{
//		return pname;
//	}
//	public ArrayList<Integer> getqtypurchased()throws IOException
//	{
//		return qtypurchased;
//	}
//	public ArrayList<Float> getprice()throws IOException
//	{
//		return price;
//	}
	
	
//	public void addToCart(int p_id,String p_name,String p_type,int qty,float pricep)throws IOException
//	{
//		pid.add(p_id);
//		pname.add(p_name);
//		ptype.add(p_type);
//		qtypurchased.add(qty);
//		price.add(pricep);
//	}
	
//	public Product getProductById(int pid) {
//		Product pro= null;
//		List<Product> list= new Product.getProductList();
//		for(Product p: list) {
//			if(p.getId()==pid) {
//				pro= p;
//				break;
//			}
//		}
//		return pro;
//	}
	
//	List<Products> mycart= new ArrayList<Products>();
//	
//	public Products getProductByName(String name) {
//		Products pro= null;
//		List<Product> list= new Product.getProductList();
//		for(Product p: list) {
//			if(p.getName()==name) {
//				pro= p;
//				break;
//			}
//		}
//		return pro;
//	}
	
//	public void addToCart(Product product) {
//		mycart.add(product);
//	}
	
//	public void addToCartById(int pid) {
//		Product pro= getProductById(pid);
//		addToCart(pro);
//	}
	
//	public List<Products> addToCart(String name) {
//		
//		Products pro= getProductByName(name);
//		
//		mycart.add(pro);
//		return mycart;
//		System.out.println(name+" added to cart!!");
//		System.out.println("Added to Cart!! Do you want to checkout(yes/no)?");
//		Scanner sc= new Scanner(System.in);
//		String str= sc.nextLine();
//		if(str=="yes") {
//			double sum=0.0;
//			for(Product p: mycart) {
//				sum= sum+p.getPrice();
//			}
//			makePayment(sum);
//		}
//		else {
//			System.out.println("your cart has following items \n");
//			viewCart();
//		}
//	}
	
//	public void viewCart()throws IOException
//	{
//		int n=mycart.size();
//		if(n!=0)
//		{
//			System.out.println("YOUR CART IS : \n");
//			System.out.println("***********************************************************************************************************************\n");
//			System.out.printf("%-30s \t %-30s \t %-30s \t %-30s \t %-30s\n", "Product_ID","Product_Name","Total_Price");
//			System.out.println("***********************************************************************************************************************\n");
//			for(Product p: mycart)
//			{
//				System.out.printf("%-30d \t %-30s \t %-30s \t %-30d \t %-30f\n",p.getProductId(),p.getProductName(),p.getPrice() );
//			}
//			System.out.println("***********************************************************************************************************************\n");
//		}
//		else
//			System.out.println("CART IS EMPTY !");
//	
//	}
//	public void removeFromCartById(int pid)throws IOException{
//		Product pro= getProductById(pid);
//		if(pro!=null) {
//			mycart.remove(pro);
//		}
//		else {
//			System.out.println("No such Product");
//		}
//		
//	}
	
//	public List<Product> removeFromCart(String name)throws IOException{
//		Product pro= getProductByName(name);
//		mycart.remove(pro);
//		
//		return mycart;
//	
//	}
//	
//	public boolean searchItem(String name) {
//		for(Product p: mycart) {
//			if(p.getProductName().equalsIgnoreCase(name)) {
//				return true;
//			}
//		}
//		return false;
//	}

}
