package list;
import java.io.*;
import java.util.*;
    //@author isokaju	
    //Linked list example with inner Node class

    public class LinkedList{

	private Node node;
	private Node current;
	private Node first;
	private Node last;

	

	public void addNode(String name, int data){
		last = new Node(name, data);
		if(first.next==null)
		   first=last;
		else{
		   current=first.next ;			
		   while(current.next!=null){
			current=current.next;
			
		   }
			
		   current.next=last;	
		}
	}	
	
	public void print(){
	   current= first.next;			
	   System.out.println("Content of list ");
	   while(current.next!=null){
		System.out.print("Name: "+current.name+ "Data: " + current.data);	 		
	         current=current.next;
	   }
	}

	private class Node{
		private int data;
		private Node next;
		private String name;	
		
		public Node(String name, int data){
			this.name = name;
			this.data = data;
			
		}

	}	 


   	
   }
	

