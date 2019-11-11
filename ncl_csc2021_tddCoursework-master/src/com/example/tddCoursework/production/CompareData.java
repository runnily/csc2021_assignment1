package com.example.tddCoursework.production;

import java.util.Comparator;

public class CompareData<D extends Data> implements Comparator<D> { // class has to extend data

	@Override
	public int compare(D o1, D o2) { // could be of any time to compare
		if (o1.toString().equals(o2.toString())) {
			return 0; // returns 0 if equal
		}
		return -1; // else returns -1
	}

}
