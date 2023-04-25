package StringClasses;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb= new StringBuilder("Riti");
//		sb.append(" Rathore");
		
		StringBuilder logMessage = new StringBuilder();
		long timestamp= System.currentTimeMillis();
		
		logMessage
		      .append("[")
		      .append(timestamp)
		      .append("] ");
		
		int userId= 123456;
		
		logMessage.append("User ").append(userId).append(": ");
		
		String message = "Login successfull";
		logMessage.append(message);
		
		System.out.println(logMessage.toString());

	}

}
