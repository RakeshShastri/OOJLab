class A extends Thread
{
  public void run()
  {
    System.out.println("BMS College of Engineering");
    try{
      Thread.sleep(10000);
    }catch(Exception e)
    {
      System.out.println("Thread Interrupted");
    } 
  }
}

class B extends Thread
{
  public void run()
  {
    System.out.println("CSE");
    try{
      Thread.sleep(2000);
    }catch(Exception e)
    {
      System.out.println("Thread Interrupted");
    }   
  }
}

class Prog9
{
  public static void main(String args[])
  {
    int x = 0;
    while(x<10)
    {
      new A().start();
      new B().start();
      x+=1;
    }
  }
}