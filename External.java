package see;
import cie.*;
import java.util.*;

class External extends Student {
	
	Scanner sc = new Scanner(System.in);


	External(String name, String usn, int sem) {
		super(name, usn, sem); 
	}
	
	int marks[] = new int[5];
	
	void getMarks() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("Enter course " + i+1 + " SEE Marks");
			int n = sc.nextInt();
			marks[i] = n;
		}
		
	}
	
	int total() {
		int total = 0;
		for(int i = 0; i <= 5; i++) {
			total = total + marks[i];
		}
		return total;
	}
	
	void display() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("Course " + i+1 + " SEE Marks = " + marks[i]);
		}
	}
}
