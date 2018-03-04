package Goose;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
	
	
	public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> list3 = new ArrayList<>();
		for(int i=0;i<list1.size();i++){
			list3.add(list1.get(i) );
		}
		for(int j=0;j<list2.size();j++){
			list3.add(list2.get(j) );
		}
		return list3;
	}
	
	
	
	
	
	public static void main(String[] args){	
		System.out.printf("HELLO WORLD \n");
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(34);
		list1.add(5);
		list1.add(3);
		list1.add(5);
		list1.add(6);
		list1.add(4);
		list1.add(33);
		list1.add(2);
		list1.add(2);
		list1.add(4);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(4);
		list2.add(3);
		list2.add(2);
		list2.add(1);
		//list.set(i,list.get(i+1) );
		System.out.println(Arrays.toString(list1.toArray()));
		System.out.println(Arrays.toString(list2.toArray()));
		ArrayList<Integer> list3 =union(list1, list2);
		System.out.println(Arrays.toString(list3.toArray()));
		
	}
}
