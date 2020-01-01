class JavaEight
{
  public static void main(String[] args)
  {
    MyFunction myFunctionImpl = new MyFunctionImpl();
    //By calling object's method
    System.out.println(myFunctionImpl.addNumbers(2, 5));
    
    //If it's one line, doesn't have to add return
    MyFunction myFunction = (int a, int b) -> "Value from lambda: " + (a + b);
    //By calling Lambda function
    System.out.println(myFunction.addNumbers(2, 5));
    
    // We call int anonymous inner class since it's inside a class and implementation class has no name
    MyFunction myFunctionAnonymousClass = new MyFunction()
    {
      @Override
      public String addNumbers(int a, int b)
      {
        return "Value from Anonymous inner class method: " + (a + b);
      }
    };
    //By calling Anonymous class function
    System.out.println(myFunctionAnonymousClass.addNumbers(2, 5));
  }
}

interface MyFunction
{
  String addNumbers(int a, int b);
}

class MyFunctionImpl implements MyFunction
{
  @Override
  public String addNumbers(int a, int b)
  {
    return "Value from MyfunctionImpl method: " + (a + b);
  }
}
