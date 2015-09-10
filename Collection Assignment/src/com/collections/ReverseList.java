package com.collections;

import java.util.*;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		
		arr.add("Sandeep");
		arr.add("is");
		arr.add("cute");
		System.out.println("Arundeep says:" + arr);
		
		Collections.reverse(arr);
		System.out.println("What does he actually mean:" +arr);
	}

}
