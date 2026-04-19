package SmallTOPICS.Streams;
import java.util.List;
import java.util.Arrays;

public class ParallelANDSequentialStreams {
    static void main() {
        List<Integer> lsit = Arrays.asList(4,1,4,24,53,35,23,42,44,33,113,42,654,11,53,33);

        // Performing some operation, Reading and printing the list using streams SEQUENTIAL
        lsit.stream()
                .filter(x -> x%2 != 0)
                .map(s -> s+100 )
                .forEach(x-> System.out.print(x+" "));

        System.out.println();

        // Performing some operation, Reading and printing the list using streams PARALLEL
        lsit.parallelStream()
                .filter(x -> x%2 != 0)
                .map(s -> s+100 )
                .distinct()
                .forEachOrdered(x-> System.out.print(x+" "));
        // To make each element in the parallel stream to be ordered, we can use the forEachOrdered() method, instead of the forEach() method.
    }
}

// https://www.geeksforgeeks.org/java/parallel-vs-sequential-stream-in-java/