package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExerciseOneJava7
{
  public static void main(String[] args)
  {
    List<Person> people = Arrays.asList(new Person("Sand2", "Fernando2", 27), new Person("Sand1", "Fernando1", 27),
        new Person("Sand5", "Fernando5", 27), new Person("Sand3", "Cernando3", 27),
        new Person("Sand4", "Fernando4", 27), new Person("Sand6", "Cernando6", 27));
    
    // Step 1
    people.sort(new Comparator<Person>()
    {
      @Override
      public int compare(Person o1, Person o2)
      {
        return o1.getLastName().compareTo(o2.getLastName());
      }
    });
    
    //With Lambda
    people.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
    
    
    
    
    
    // Step 2
    printAll(people);
    
    //With Lambda
    printLastNameConditionally(people, p -> true, p -> System.out.println(p));
    
    
    
    
    
    
    // Step 3
    printLastNameConditionally(people, new Predicate<Person>()
    {
      @Override
      public boolean test(Person p)
      {
        return p.getLastName().startsWith("C");
      }
    }, new Consumer<Person>()
    {
      @Override
      public void accept(Person person)
      {
        System.out.println(person);
      }
    });
    
    //With Lambda
    printLastNameConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
  }
  
  private static void printAll(List<Person> people)
  {
    System.out.println("Printing all persons");
    for (Person p : people)
    {
      System.out.println(p);
    }
  }
  
  private static void printLastNameConditionally(List<Person> people, Predicate<Person> condition,
                                                 Consumer<Person> consumer)
  {
    System.out.println("Printing all persons conditionally");
    for (Person p : people)
    {
      if (condition.test(p))
      {
        consumer.accept(p);
      }
    }
  }
}

interface Condition
{
  boolean test(Person p);
}
