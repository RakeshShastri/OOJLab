import java.util.*;
abstract class shape {
	int x,y;
	void area() {};
}
class Rectangle extends shape {
	void area(double x,double y) {										
			System.out.println("Area of rectangle is :"+(x*y));
	}
}
class Circle extends shape {
	void area(double x) {												
		System.out.println("Area of circle is :"+(3.14*x*x));
	}
}
class Triangle extends shape {
	void area(double x,double y) {												
		System.out.println("Area of triangle is :"+(0.5*x*y));
	}
}
public class PrintAreaProgram {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length and Breadth of Rectangle");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Rectangle r=new Rectangle();
		r.area(x,y);
		System.out.println("Enter radius of Circle");
		int rad = sc.nextInt();
		Circle c=new Circle();
		c.area(rad);
		Triangle t=new Triangle();
		System.out.println("Enter Base and Height of Triangle");
		int b = sc.nextInt();
		int h = sc.nextInt();
		t.area(b,h);
		sc.close();
	}
}
