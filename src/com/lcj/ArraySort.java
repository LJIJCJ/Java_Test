package com.lcj;

public class ArraySort {
	int[] sim;
	public ArraySort(int[] a) {
		sim=new int[a.length];
		for(int i=0;i<a.length;i++) {
			sim[i]=a[i];
		}
	}
	public void setOrder() {
		int temp=-1,i=0;
		for(;i<sim.length;i++) {
			for(int j=i+1;j<sim.length;j++) {
				if(sim[i]>sim[j]) {
					temp=sim[i];
					sim[i]=sim[j];
					sim[j]=temp;
				}
			}
		}
	}
}