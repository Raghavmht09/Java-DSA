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
	
	void removeDuplicates()
    {
      
        Node curr = head;
 
        
        while (curr != null) {
             Node temp = curr;
           
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
       
            curr.next = temp;
            curr = curr.next;
        }
    }
	
	void swaplastandfirst() {
		if(head==null||head.next==null) {
			return;
		}
		Node seclast=null;
		Node last=head;
		while(last.next!=null) {
			seclast=last;
			last=last.next;
		}
	seclast.next=null;
	last.next=head;
	head=last;
	}
	void findmiddle(linkedlist list,int n)
    {
      Node p=head,q=head;
		while(p!=null && p.next!=null)
      {
              p=p.next.next;
              q=q.next;
      }
      System.out.println(q.data);
    }
	void reverse() {
		Node current=head,prev=null,next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			
			current=next;
		}
		head=prev;
	}
	
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
	
	void insertsorted(int data) {
		Node current;
		Node newNode= new Node(data);
		
		if(head==null||head.data>=newNode.data) {
			newNode.next=head;
			head=newNode;
			return;
		}
		else {
			current=head;
			while (current.next != null 
					&& current.next.data < newNode.data) 
					                current = current.next; 
					  
					            newNode.next = current.next; 
					            current.next = newNode; 
					        } 
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
