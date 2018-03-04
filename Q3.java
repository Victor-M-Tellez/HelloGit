package Goose;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {
	//Remove duplicates 
	public static void removeDuplicate(ArrayList<Integer> list){
		int size=list.size();
		for(int i=0; i<size;i++){
			for(int j=i+1; j<size-2;j++){	
				if(list.get(j).equals(list.get(i))){
					list.remove(j);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args){	
		System.out.printf("HELLO WORLD \n");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(5);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(33);
		list.add(2);
		list.add(2);
		list.add(4);
		//list.set(i,list.get(i+1) );
		System.out.println(Arrays.toString(list.toArray()));
		removeDuplicate(list);
		System.out.println(Arrays.toString(list.toArray()));
		
	}
}
