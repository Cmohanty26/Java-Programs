package com.comparator;

import java.util.Comparator;

public class LenCom1 implements Comparator{
	public int compare(Object arg1,Object arg2) {
		return ((String)arg1).length()-((String)arg2).length();
	}
	
	

}
