import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample
{
  public static void main(String[] args)
  {
    Thread thread = new Thread(MethodReferenceExample::printMessage);
    thread.start();
  
    List<String> list = Arrays.asList("A", "B");
  
    list.forEach(p -> System.out.println(p));
    list.forEach(System.out::println);
  }
  
  public static void printMessage()
  {
    System.out.println("Hello");
  }
}
