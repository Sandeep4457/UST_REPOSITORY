package com.ust.polymorphism;

public class OverloadingDemo {
	public int add(int i1,int i2) {
	return i1+i2;
}
public double add(double d1,double d2) {
	return d1+d2;
}
public String add(String s1,String s2) {
	return s1+s2;
}
public int add(int i1,int i2,int i3) {
	return i1+i2+i3;
}
public String add(String s1,String s2,String s3) {
	return s1+s2+s3;
}
public static void main(String[] args) {
	OverloadingDemo c=new OverloadingDemo();
	
	
	System.out.println(c.add("a","b","c"));
	System.out.println(c.add(3,4));
	System.out.println(c.add(78.90,56.78));
	System.out.println(c.add("Sandeep","sk"));
	System.out.println(c.add(23,45,43));
}
	
	}

}
