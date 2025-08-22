package com.cts.practice;

import java.util.Comparator;

public class CompareMarks implements Comparator<StudentInit> {
	public int compare(StudentInit one, StudentInit two) {
		return (int)(one.getMarks() - two.getMarks());
	}



}
