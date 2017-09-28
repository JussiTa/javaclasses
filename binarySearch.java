import java.util.*;
import java.util.*;


public class binarySearch{	

	
	static int search(int [] t, int a){	

		int left =0;
		int right= t.length-1;

		while(left<=right){
			int middleIndex =(left+right)/2;
			int middle = t[middleIndex];
			if(a<middle)
				right=middle-1;

			else if(a>middle)
				left=middle+1;
			else
				return middleIndex;
		}
				


		
		   return -1;


		

	}

 
	public static void main (String [] args){
		 int[] table ={1,2,3,4,5,6,7,8,9,10,11,12,13,14};		
		
		System.out.println("" +search(table, 12));






	}



}










