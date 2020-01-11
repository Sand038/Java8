import java.util.Arrays;
import java.util.List;

public class StreamExample
{
  public static void main(String[] args)
  {
    List<String> list = Arrays.asList("Ashley", "Chris", "Max", "Conan", "Sand");
    
    list.stream().filter(e -> e.startsWith("C")).forEach(System.out::println);
    
    long count = list.stream().filter(e -> e.startsWith("C")).count();
    System.out.println("Stream: " + count);
    
    long countParallel = list.parallelStream().filter(e -> e.startsWith("C")).count();
    System.out.println("Parallel Stream: " + countParallel);
  }
}
