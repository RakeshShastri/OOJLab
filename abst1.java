abstract class Figure{


  int dim1,dim2;


     Figure(int x,int y)
     {

          dim1=x;
          dim2=y;
      }


 abstract double area();
 
 }



 class Rectangle extends Figure{

    
         Rectangle(int x,int y)
        {

            super(x,y);
         }
       


         double area()     
       {
           return  dim1*dim2;
        }

 }



class triangle extends Figure{

            
           triangle(int x,int y)
           {

                super(x,y);
            }


           double area()     
       {
           return  0.5*(dim1*dim2);
        }

            double perimeter()
            {
               return dim1+dim2;
            }

  }



 class abst1{


   public static void main(String args[])

    {

          Rectangle r1=new Rectangle(20,30);
           triangle t1=new triangle(40,50);

            Figure f;
            f=r1;  
           double a1=f.area();

          System.out.println("area of Rectangle is"+" "+a1);
              
             f=t1;  
             a1=f.area();
            //double a2=f.perimeter();
          System.out.println("area of triangle is"+" "+a1);  

    }
 } 
           