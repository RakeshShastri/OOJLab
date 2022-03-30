interface callback{
  void callback(int p);
 }




 class client implements callback
{
   public void callback(int p)
   {
     System.out.println("the value of p in callback is"+" "+p);
    }
    void Nonifacemethod()
    {

      System.out.println("this cannot be called by interface refernce var");
    }
 }


 class Anotherclient implements callback
 {
   public void callback(int p)
   {

     System.out.println("the value of p in anotheclient is"+" "+p);
    }
 }



               



  class testiface{

     public static void main(String args[])
    {
        client c1=new client();

         callback r;

           r=c1;
         
           r.callback(50);
          // r.Nonifacemethod();
           c1.Nonifacemethod();
        
          Anotherclient a1=new Anotherclient();

              r=a1;
             r.callback(100);
       }
  }
 
 


   
 