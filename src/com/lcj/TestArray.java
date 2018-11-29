package com.lcj;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {12,49,3,5,4,9,7};
		ArraySort arr=new ArraySort(a);
		System.out.println("≈≈–Ú«∞£∫"+Arrays.toString(arr.sim));
		arr.setOrder();
		System.out.println("≈≈–Ú∫Û£∫"+Arrays.toString(arr.sim));
	}

}



