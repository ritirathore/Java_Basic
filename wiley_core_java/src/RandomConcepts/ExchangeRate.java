package RandomConcepts;

import java.text.DecimalFormat;

public class ExchangeRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dollar=100;
		DecimalFormat f= new DecimalFormat("##.##");
		
		double rupee= dollar*70;
		System.out.println("Rupee:"+ f.format(rupee));
		
		double euro= dollar*0.78;
		System.out.println("Euro:"+f.format(euro));
		

	}

}
