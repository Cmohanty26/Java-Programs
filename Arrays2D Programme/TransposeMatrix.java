package com.Arrays2D;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] a= {
				{2,3,5},
				{7,1,0},
				{1,2,3}
				
		};
		int[][] b=new int[a[0].length][a.length];;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=a[j][i];
			}
		}
		for(int[] temp:b) {
			for(int n:temp) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		}

	}


