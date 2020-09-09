package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class q1 {

	public static void main(String[] args) {
	List<Integer> x1 = new ArrayList<Integer>();
	List<Integer> y1 = new ArrayList<Integer>();
	List<Integer> result = new ArrayList<Integer>(x1.size());

	x1.add(1);
	x1.add(2);
	x1.add(3);
	
	y1.add(3);
	y1.add(2);
	y1.add(1);
	
	for(int i =0 ;i <x1.size() ;i++){
		
		if(x1.get(i) > y1.get(i))
			result.add(1);
		
		if(x1.get(i) < y1.get(i))
			result.add(1);
		
	}
	
		System.out.println("final answer"+result);
	
	}

}
