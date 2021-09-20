package org.cap.demo;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from STS!");
		show();
	}
	public static void show() {
		int[] arr= {12,13,23,23};
		for(int i=0;i<100;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("show method here!");
	}
}
