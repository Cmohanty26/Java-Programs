package com.Array;

public class Occurancy {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,1,2,3,3,4,5};

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
					count++;
				}
			}
			System.out.println(a[i]+"="+count);
		}
		
	}

}
