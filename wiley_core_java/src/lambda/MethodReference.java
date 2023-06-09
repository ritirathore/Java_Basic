package lambda;

interface Sayable{
	void say();
}
interface GetInfo{
	Info getMsg(String str);
}

class Info{
	Info(String msg){
		System.out.println(msg);
	}
}

public class MethodReference {
	
	public void getMsg(String str) {
		System.out.println(str);
	}
	
	public void hello() {
		System.out.println("Kochi");
	}
	
	public static void saySomething() {
		System.out.println("Hi Riti");
	}
	
	public static void processSomething() {
		System.out.println("Hi Riti Rathore");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetInfo info= Info::new;
		info.getMsg("my message");
		
		MethodReference mt= new MethodReference();
		Sayable isv= mt::hello;
		isv.say();
		
//		new MethodReference()::hello;
		
		Sayable say= MethodReference::saySomething;
		say.say();
		
		Thread t1= new Thread(MethodReference::processSomething);
		t1.start();

	}

}
