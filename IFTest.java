interface A{

void meth1();
}


interface B extends A{

void meth2();
 void meth3();
 }


class Myclass implements B{


public void meth1()
{
 System.out.println("Inside method 1");
 }

public void meth2()
{
 System.out.println("Inside method 2");
}


public void meth3()
{
 System.out.println("Inside method 3");
}

}




class IFTest {

 public static void main(String args[])
{

    Myclass m1=new Myclass();

  m1.meth1(); m1.meth2(); m1.meth3();
}
}