package com.cts.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class StudentInit implements StudentDetails {
	Scanner sc = new Scanner(System.in);
	private int rollno ;
	private String name;
	private double marks;

	
	public StudentInit(int r, String n, double m) {
		rollno = r;
		name = n;
		marks = m;
	}
	
	static SortedSet<StudentInit> ss = new TreeSet<>(new CompareMarks());
	static ArrayList<StudentInit> al = new ArrayList<>();
	
	 public void AddDetails() {
		 al.add(this);
		 ss.add(this);
	 }
	 
	 public void RemoveStudent() {
		    System.out.print("Enter the Roll Number to remove: ");
		    int roll = sc.nextInt();
		    boolean found = false;

		    // Remove from ArrayList using index
		    for (int i = 0; i < al.size(); i++) {
		        if (al.get(i).getRollno() == roll) {
		            al.remove(i);
		            found = true;
		            break;
		        }
		    }

		    // Remove from TreeSet using a temporary reference
		    StudentInit toRemove = null;
		    for (StudentInit s : ss) {
		        if (s.getRollno() == roll) {
		            toRemove = s;
		            break;
		        }
		    }
		    if (toRemove != null) {
		        ss.remove(toRemove);
		    }

		    if (found) {
		        System.out.println("Student removed successfully.");
		    } else {
		        System.out.println("Student not found.");
		    }
		}

	 public void Display() {
		 System.out.println("The List of students is : ");
		for(StudentInit s : al)
		 System.out.println(s);
		
	 }
	 public void DisplaySortedList() {
		 System.out.println("The Sorted List of students is : ");
			for(StudentInit t : ss)
			 System.out.println(t);
	 }
	

	public int getRollno() {
		return rollno;
	}


	 public String getName() {
		 return name;
	 }

	 public double getMarks() {
		 return marks;
	 }


	@Override
	public String toString() {
		return "Roll-no : "+rollno+", Name : "+name+", Marks : "+marks; 
	}
	
	

}
