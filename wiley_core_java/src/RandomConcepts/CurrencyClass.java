package RandomConcepts;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Currency usd= Currency.getInstance("USD");
		NumberFormat f= NumberFormat.getCurrencyInstance(Locale.US);
		String fv= f.format(108.5);
		System.out.println(fv);
		
		Currency r= Currency.getInstance("INR");
		NumberFormat f1= NumberFormat.getCurrencyInstance(new Locale("en","in"));
		String fv1= f1.format(108.5);
		System.out.println(fv1);
		
		//formatting currency with locale along with NumberFormat class
		double price= 2000.25;
		Locale local= new Locale("en","US");
		NumberFormat cf= NumberFormat.getCurrencyInstance(local);
		String fp= cf.format(price);
		System.out.println(fp);

		//custom formatter
		DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
		decimalFormatter.setPositivePrefix("$");
		String res= decimalFormatter.format(price);
		System.out.println(res);
		
		Currency cur= Currency.getInstance("USD");
		String symbol= cur.getSymbol(Locale.US);
		String code= cur.getCurrencyCode();
		System.out.println(symbol);
		System.out.println(code);
	}

}
