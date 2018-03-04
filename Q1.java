package Goose;

public class Q1 {

	
	
	
	
	
	
	
	
	public static void main(String[] args){		
		System.out.printf("HELLO WORLD \n");
		int n= 5;
		
		int[][] myArray = new int[n][n];
		for(int i = 0 ; i<n; i++){
			for(int j = 0 ; j<n; j++){
				double rand = Math.random();
				int binary;
				if(rand>0.5){
					binary=1;
				}else{
					binary=0;
				}
				myArray[i][j]=binary;
			}
		}
		for(int i = 0 ; i<n; i++){
			for(int j = 0 ; j<n; j++){
				System.out.print(myArray[i][j]+" ");
			}
			System.out.println("");
		}
		int[] row=new int[n];
		int[] col = new int[n];
		
		for(int i = 0 ; i<n; i++){
			for(int j = 0 ; j<n; j++){
				row[i]+=myArray[i][j];
				col[j]+=myArray[i][j];
			}
		}
		System.out.println("\n");
		for(int i = 0 ; i<n; i++){
			System.out.print(row[i]+" ");
		}
		System.out.println("\n");
		for(int i = 0 ; i<n; i++){
			System.out.print(col[i]+" ");
		}
		int max=row[0];
		int pointer=0;
		for(int i = 0 ; i<n; i++){
			if(row[i]>max){
				max=row[i];
				pointer=i;
			}
		}
		System.out.println("\n\nMax row is: "+(pointer+1)+" with "+max+" total");
		
		
		max=col[0];
		pointer=0;
		for(int i = 0 ; i<n; i++){
			if(col[i]>max){
				max=col[i];
				pointer=i;
			}
		}
		System.out.println("Max col is: "+(pointer+1)+" with "+max+" total");
		
	}
	
	
	
	
	
}
