package com.comparator;

import java.util.Comparator;

public class SalCompare implements Comparator{
	public int compare(Object arg1,Object arg2) {
		double sal1=((Emp)arg1).sal;
		double sal2=((Emp)arg2).sal;
		if(sal1>sal2)return 1;
		if(sal1<sal2)return -1;
		return 0;
		
	}

}
