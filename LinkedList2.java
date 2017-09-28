import java.io.*;



public class LinkedList2{

public static void main (String [] args){

	Node node1 = new Node<String>("jussi");
        Node node2 = new Node<String>("Anu");
	Node node3 = new Node<String>("Topias");

	node1.next= node2;
	node2.next= node3;
	node3.next = null;

        Node footer = new Node<String>("Footer");
	node3.next= footer;

	Node dummy;

	dummy = node1;


	 while(dummy.next!=null){
		System.out.println(dummy.getData());

		dummy= dummy.next;

	}			




}


}
