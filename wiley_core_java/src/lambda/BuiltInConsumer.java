package lambda;

import java.util.function.BiConsumer;

public class BuiltInConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer,Integer> el= (Integer age, Integer p) ->{
			if(age>18 && p>75) {
				System.out.println("eligible for job");
			}else {
				System.out.println("not elgible for job");
			}
		};
		
		el.accept(22, 81);

	}

}
