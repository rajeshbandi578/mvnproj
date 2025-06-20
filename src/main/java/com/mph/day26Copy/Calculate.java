package com.mph.day26Copy;


public class Calculate {
	
	public int add (int... n) {
		int r = 0;
		for(int i : n) {
			r = r+i;
		}
		return r;
	}
	
	public double multiply (int... n ) {
		int z=1;
		for(int i : n) {
			z=z*i;
		}
		System.out.println(z);
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c = new Calculate();
		
		System.out.println(c.add(10,20,30));
		
	}

}
