abstract class A{

  int i,j;
 abstract void callme();

 void callmetoo()
 {
     System.out.println("This method can be called");
   }


 }



class B extends A{
 
       int i,j;
        B()
       {
          super.i=300; super.j=400;
         i=100;
         j=200;  
       }  
 
   void callme()
  {
       System.out.println("Abstact method is defined in subclass");
       System.out.println("i and j value are in superclass is"+" "+super.i+" "+super.j); 
       System.out.println("i and j value are in subclass is"+" "+i+" "+j);
   }

 }

class ab{

       public static void main(String args[])
       {

           B b1=new B();

           b1.callmetoo();
           b1.callme();
          System.out.println("i and j value are in subclss is"+" "+b1.i+" "+b1.j);
        }
   }       