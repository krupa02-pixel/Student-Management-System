package com.cts.practice;


import java.util.Scanner;


public class Student {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StudentInit obj1 = new StudentInit(0, "", 0.0);
    while(true) {
		System.out.println("1. Add Details\n2. Remove Details\n3. Display Details\n4. Display Sorted List of Students\n5. Exit");
		System.out.println("Enter your choice : ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 : System.out.println("Enter Roll Number : ");
		         int r = sc.nextInt();
		         sc.nextLine();
		         System.out.println("Enter Name : ");
		         String name = sc.nextLine();
		         System.out.println("Enter Marks : ");
		         double marks = sc.nextDouble();
                 StudentInit obj = new StudentInit(r,name,marks);
		         obj.AddDetails();
		         System.out.println("Added Successfully!!");
		         break;
		case 2 :obj1.RemoveStudent();break;
		case 3 : obj1.Display();break;
		case 4 : obj1.DisplaySortedList();break;
		case 5 : System.out.println("Exiting...");
		         sc.close();
		         return;
		default : System.out.println("Invalid Choice...");
		}
    }
	
	
}
}
