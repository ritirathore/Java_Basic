package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TopPerformer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Performer> PerformerList=new ArrayList<>();
		Performer s1=new Performer(1,"riti",4,"H");
		Performer s2=new Performer(2,"rathore",5,"G");
		Performer s3=new Performer(3,"vaibhav",8,"F");
		Performer s4=new Performer(4,"vaishi",0,"J");
		Performer s5=new Performer(5,"didi",2,"I");
		Performer s6=new Performer(6,"kochi",98,"A");
		Performer s7=new Performer(7,"seema",40,"B");
		Performer s8=new Performer(8,"tina",10,"E");
		Performer s9=new Performer(9,"hina",11,"D");
		Performer s10=new Performer(11,"sam",12,"C");
		PerformerList.add(s1);
		PerformerList.add(s2);
		PerformerList.add(s3);
		PerformerList.add(s4);
		PerformerList.add(s5);
		PerformerList.add(s6);
		PerformerList.add(s7);
		PerformerList.add(s8);
		PerformerList.add(s8);
		PerformerList.add(s10);
		List<Performer> filteredData1=PerformerList.stream().distinct().sorted((a,b)->(b.problems_solved-a.problems_solved)).limit(5).collect(Collectors.toList());
		System.out.println("Top 5 Performers");
		for(Performer Performer:filteredData1) {
			System.out.println("Performer ID: "+Performer.id);
			System.out.println("Performer NAME: "+Performer.name);
			System.out.println("PROBLEMS_SOLVED: "+Performer.problems_solved);
			System.out.println("Performer GRADE: "+Performer.grade);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}


	}

}
