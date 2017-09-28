import java.io.*;
import java.util.*;



    public class LinkList{

	private Node node;
	private Node current;
	private Node first;
	private Node last;

	
	public void addNode(String name, int data){
		last = new Node(name, data);
		if(first.next==null)
			first=last;
		else{
		   current=first.next;			
		   while(current.next!=null){
			current=current.next;
			
		   }
			
		   current.next=last;	
		}
	}			
	

	private class Node{
		private int data;
		private Node next;
		private String name;	
		
		public Node(String name, int data){
			current.name = name;
			current.data = data;
			
		}

	}	 


   	
   }
	

