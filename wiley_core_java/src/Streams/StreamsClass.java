package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = {1,2,3,4,5,6};
//		int sum=0;
//		for(int i=0;i<array.length;i++) {
//			if(array[i]%2==0) {
//				sum+=array[i];
//			}
//		}
//		System.out.println(sum);
//		
//		int[] arr= {1,2,3,4,5,6};
//		int total= Arrays.stream(array).filter(n -> n%2==0);
		
//		List<String> list=Arrays.asList("Java","Python", "Angular");
//		Stream<String> myStream= list.stream();
//		
//		String[] arr= { "Java","Python", "Angular"};
//		Stream<String> arr1= Arrays.stream(arr);
//		Stream<Integer> integerStream = Stream.of(1,2,3);
//		Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);
//		
//		Stream<String> limitString= Stream.generate(() -> "wiley").limit(5);
//		Stream<Integer> limitRandom= Stream.generate(() -> (int) Math.random()*100 ).limit(5);
		
		List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9,2,3,4);
//		List<Integer> filterData= list1.stream().filter(x -> x%2==0).collect(Collectors.toList());
//		
//		System.out.println(filterData);
//		List<Integer> mappedList= filterData.stream().map(n -> n/2).collect(Collectors.toList());
//		System.out.println(mappedList);
		
		List<Integer> filterData= list1.stream().filter(x -> x%2==0).map(n -> n/2).distinct().sorted((a,b) -> (b-a)).limit(3).collect(Collectors.toList());
		System.out.println(filterData);

	}

}
