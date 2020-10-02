package linkedLists;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class linkedlist {
	Node head= null;
	
	void insertbeg(int data) {
		
	Node newnode= new Node(data);
	newnode.next=head;
	head=newnode;
	
	}
	
	void insertend(int data) {
		Node newnode = new Node(data);
		if(head==null) {
			head=newnode;
		}
		else {
			Node tempnode=head;
			while(tempnode.next!=null) {
				tempnode=tempnode.next;
			}
			tempnode.next=newnode;
		}
	}
	
	void insert(int num, int data) {
		Node tempnode=head;
		while(tempnode.data!=num && tempnode!=null) {
			tempnode=tempnode.next;
		}
		Node newnode= new Node(data);
		newnode.next=tempnode.next;
		tempnode.next=newnode;
	}
	
	void delete(int num) {
		Node currnode=head;
		Node prevnode=null;
		while(currnode!=null && currnode.data!=num) {
			prevnode=currnode;
			currnode=currnode.next;
			
		}
		if(currnode==head) {
			if(head==null) {
				System.out.println("list is empty");
				return;
			}
			else {
				head=head.next;
				return;
			}
		}
		else prevnode.next=currnode.next;
	}
	
	void printall() {
		Node tempnode=head;
		
		while(tempnode!=null) {
			System.out.print(tempnode.data+" ");
			tempnode=tempnode.next;
		}
		System.out.println();
		
	}
	
}
