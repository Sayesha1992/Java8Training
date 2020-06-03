package hometasksix;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsOnStreams {
	
	public static void removeDuplicatedAndConcat(Stream<Integer> firstStream, Stream<Integer> secondStream) {
		Stream.concat(firstStream.distinct(), secondStream.distinct()).forEach(System.out::println);
		
	}

}
