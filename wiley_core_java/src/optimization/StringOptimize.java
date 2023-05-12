package optimization;

public class StringOptimize {
public static void main(String[] args) {
	long start= System.currentTimeMillis();
	String res="";
	for(int i=0;i<10000;i++) {
		res+=i;
	}
	long end=System.currentTimeMillis();
	System.out.println("Time taken to adda 10000 value in string:"+(end-start));
	
	start=System.currentTimeMillis();
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<10000;i++) {
		sb.append(i);
	}
     end=System.currentTimeMillis();
	System.out.println("Time taken to adda 10000 value in stringbuilder:"+(end-start));


}
}
