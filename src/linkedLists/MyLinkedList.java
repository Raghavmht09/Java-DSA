package linkedLists;

import java.util.*;

public class MyLinkedList<E>{
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head= toAdd;
			return;
		}
      Node<E> temp=head;
      
      while(temp.next!=null) {
    	  temp=temp.next;
    	  
      }
	
      temp.next=toAdd;
      
	}

	void print() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"");
			temp=temp.next;
		
		}
		
	}
	public boolean isEmpty() {
		return head==null;
	}
}
