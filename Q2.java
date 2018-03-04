package Goose;
import java.util.ArrayList;
import java.util.Arrays;
public class Q2 {
//Sort ArrayList
	
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
	
	
	
	
	public static void main(String[] args){	
		System.out.printf("HELLO WORLD \n");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(9);
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(8);
		list.add(10);
		list.add(3);
		list.add(7);
		list.add(6);
		//list.set(i,list.get(i+1) );
		System.out.println(Arrays.toString(list.toArray()));
		sort(list);
		
		
		System.out.println(Arrays.toString(list.toArray()));
		
	}
}
