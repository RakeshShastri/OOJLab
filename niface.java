
class A{

      interface Nestedif{

      boolean isnotnegative(int x);
      }
    }




class B implements A.Nestedif{


     public boolean isnotnegative(int x)
    {

        if(x<0)
       return false;
       else
         return true;
     }

 void meth1()
 {
   System.out.println("Noniface method");
}

 }




 class  niface
 {

    public static void main(String args[])
    {

        B b1=new B();

        A.Nestedif r1;
         
          r1=b1;
         boolean value=r1.isnotnegative(100);

        System.out.println("value of boolean is"+" "+value);

        value=r1.isnotnegative(-123);
           
         System.out.println("value of boolean is"+" "+value);
         b1.meth1();
    }
 }
    