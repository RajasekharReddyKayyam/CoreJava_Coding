package StreamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(11);
		list.add(3);
		list.add(7);
		System.out.println(list);
		List <Integer >l=list.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(l);
	}

}
