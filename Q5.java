package Goose;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {
	//Algebra: perfect square
	public static ArrayList<Integer> factor(ArrayList<Integer> list, int x){
        for(int i=2; i<=x; i++){
            while(x%i==0){
                list.add(i);
                x = x/i;
            }
        }
        return list;
	}
	
	public static void sort(ArrayList<Integer> list){
		int size=list.size();
		for(int i=1; i<size;i++){
			Integer temp = list.get(i);
			int j;
			for(j=i-1; j>=0 && temp<list.get(j);j--){
				list.set(j+1,list.get(j) );
			}
			list.set(j+1,temp );
		}
	}
	
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
	
	
	
	public static boolean modeOdd(ArrayList<Integer> list, Integer x){
		int size=list.size();
		int count =0;
		for(int i=0; i<size;i++){
			if(list.get(i).equals(x)){
				count++;
			}
			
			
		}
		if(count%2==0){
			return false;
		}else{
			return true;
		}
	}
	
	
	public static void main(String[] args){	
		//System.out.printf("HELLO WORLD \n");
		int m=1500;
		
		ArrayList<Integer> list = new ArrayList<>();
		list=factor(list,m);
		//System.out.println(Arrays.toString(list.toArray()));
		
		sort(list);
		
		//System.out.println(Arrays.toString(list.toArray()));
		
		ArrayList<Integer> noDup = (ArrayList<Integer>) list.clone();;
		
		removeDuplicate(noDup);
		//System.out.println("NODUP:  "+Arrays.toString(noDup.toArray()));
		//System.out.println("LIST:  "+Arrays.toString(list.toArray()));
		ArrayList<Integer> odds = new ArrayList<>();
		for(int i=0; i<noDup.size();i++){
			if(modeOdd(list, noDup.get(i))){
				odds.add(noDup.get(i));
			}
			
		}
		
		//System.out.println(Arrays.toString(odds.toArray()));
		
		int n=1;
		for(int i=0; i<odds.size();i++){
			n= n*odds.get(i);
			
		}
		System.out.println("N == "+n);
		System.out.println("m*n == "+n*m);
		
	}
	
	
	
	
	
	
}
