package optimization;

public class CommonSubExpression {
	
	public int calculate(int x, int y) {

//		int result1 = (x * x) + (3 * x) - (2 * y) + 3;
//		int result2 = (x * x) + (3 * x) - (2 * y) + 3;
//		int result3 = (x * x) + (3 * x) - (2 * y) + 3;

		int commonSubExpression = (x * x) + (3 * x) - (2 * y) + 3;
		int res1 = commonSubExpression;
		int res2 = commonSubExpression;
		int res3 = commonSubExpression;

		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
