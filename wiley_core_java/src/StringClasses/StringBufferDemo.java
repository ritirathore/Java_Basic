package StringClasses;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer chatHistory = new StringBuffer();
		String sender="Riti";
		String message="Hey Shobs!";
		chatHistory.append(sender);
		chatHistory.append(": ");
		chatHistory.append(message);
		
		chatHistory.append("\n");
		
		sender= "Shobs";
		message= "Hello Riti!";
		
		chatHistory.append(sender);
		chatHistory.append(": ");
		chatHistory.append(message);
		
		chatHistory.append("\n");
		
		System.out.println(chatHistory);

	}

}
