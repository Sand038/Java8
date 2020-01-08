public class RunnableExample
{
  public static void main(String[] args)
  {
    // With Anonymous class
    Thread thread = new Thread(new Runnable()
    {
      @Override
      public void run()
      {
        System.out.println("Printed inside Runnable");
      }
    });
    thread.run();
    
    // With Lambda
    Thread threadWithLambda = new Thread(() -> System.out.println("Printed inside Runnable using lambda"));
    threadWithLambda.run();
  }
}
