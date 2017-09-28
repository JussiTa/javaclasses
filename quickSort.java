import java.io.*;
import java.util.*;


public class quickSort{


	static void swamp(int[] t, int low, int high){
		int temp;
		temp= t[low];
		t[low]= t[high];
		t[high]=temp;	


	}


	static void sort(int[] t, int low, int high){
		//int t[] = {3,4,5,6,2,10,7,8,9,1};
			//{1,4,5,6,2,10,7,8,9,3};
			//{1,2,5,6,4,10,7,8,9,3};		

		int div, left, right;
		left = low;
		right= high;
		div= t[(high+low)/2];

		do{

		   while(t[left]<div)
		      left++;
		
			while(t[right]>div)
			   right--;

			if(left<=right){
			   swamp(t, left, right);
			   left++;
			   right--;				
			}

		


		}while(left<right);

		if(low <right) sort(t,low, right);

		//if(left < high) sort(t,left, high); 






	}

	


public static void main (String [] args){

		int t[] = {3,4,5,6,2,10,7,8,9,1};

		sort(t, 0, t.length-1);
			for(int i=0;i<t.length; i++)
				System.out.print(" " +t[i]+ " "); 	

	}









}
