import java.util.*;
import java.io.*;


public class Pair<T1,T2>{

private T1 firstItem;
private T2 secondItem;

   public Pair (T1 first, T2 second){
	
	this.firstItem = first;
	this.secondItem = second;

   }	

   public T1 first(){

	return firstItem;
   } 	


   public T2 second(){

	return secondItem;
   }	

}
    	
	 
	
