package cie;
import java.util.*;
class Internals {
	int marks[] = new int[5];
	
	Scanner sc = new Scanner(System.in);
	
	Internals() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("Enter course " + i+1 + " CIE Marks");
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
			System.out.println("Course " + i+1 + " CIE Marks = " + marks[i]);
		}
	}
}
