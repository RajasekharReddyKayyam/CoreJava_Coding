package StreamAssignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question_3 {
	public static void main(String[] args) {
//3. Generate a Stream<List<String>> using the Stream.of(Arrays.asList(“a”, “b”), Arrays.asList(“a”,
//“c”)) method call. Filter the stream so that only list’s that contain “c” make it through the filter.
//Flatten the Stream<List<String>> to a Stream<String> using the flatMap() operation. Note that
//flapMap() states in the API “Each mapped stream is closed after its contents have been placed into
//this [new] stream.”. Use forEach() to output the new stream. 
		
		Stream<List<String>> s=Stream.of(Arrays.asList("a","b"),Arrays.asList("a","c"));
		s.filter((i)->i.contains("c")).flatMap(List::stream).forEach(i->System.out.println(i));
	}

}
