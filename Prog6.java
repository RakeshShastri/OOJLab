package see;
import java.util.*;

class Prog6 {
	public static void main(String args[]) {
		External s1 = new External[10];
		Internal i1 = new Internal[10];
		int size;
		Scanner sc = new Scanner(System.out);
		System.out.println("Enter number of students");
		size = sc.nextInt;
		for(i = 0; i <= size; i++) {
			System.out.println("Enter Student name");
			String name = sc.next;
			System.out.println("Enter Student USN");
			String usn = sc.next;
			System.out.println("Enter Student semester");
			int name = sc.nextInt;
			s1[i] = new External(name, usn, sem);
			s1[i].display()
			i1[i] = new Internals();
			i1[i].display();
			System.out.println("SEE Total = " + s1[i].total());
			System.out.println("CIE Total = " + i1[i].total());
		}
	}
}