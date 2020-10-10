import java.util.*;

public class OddEvenLL {
	Node head=null;
	 Node evenStart ;
     Node evenEnd ;
     Node oddStart;
     Node oddEnd ;

	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
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
	
	void printall() {
		Node tempnode=head;
		
		while(tempnode!=null) {
			System.out.print(tempnode.data+" ");
			tempnode=tempnode.next;
		}
		System.out.println();
		
	}
	
	void segregateOddEven() {
			  evenStart = null; 
		      evenEnd = null; 
		      oddStart = null; 
		      oddEnd = null; 
	        Node currentNode = head; 
	          
	        while(currentNode != null) { 
	            int element = currentNode.data; 
	              
	            if(element % 2 == 0) { 
	                  
	                if(evenStart == null) { 
	                    evenStart = currentNode; 
	                    evenEnd = evenStart; 
	                } else { 
	                    evenEnd.next = currentNode; 
	                    evenEnd = evenEnd.next; 
	                 
	                } 
	           
	                
	            }
	        
	            else { 
	                  
	                if(oddStart == null) { 
	                    oddStart = currentNode; 
	                    oddEnd = oddStart; 
	                } else { 
	                    oddEnd.next = currentNode; 
	                    oddEnd = oddEnd.next; 
	                } 
	            } 
	                        // Move head pointer one step in forward direction 
	            currentNode = currentNode.next;     
	        } 
	          
	          
	        if(oddStart == null || evenStart == null) { 
	            return; 
	        } 
	      
//	    Node newevenStart= reverse(evenStart);
//	    Node newcurr=newevenStart;
//	    Node newevenend=null;
//	    while(newcurr!=null && newcurr.next!=null) {
//	    	newcurr=newcurr.next;
//	    }
//	    newevenend=newcurr;
//	    
	    	
	        oddEnd.next = evenStart;
	        evenEnd.next=null;
	        head=oddStart;
	}
	
	 Node reverse(Node node)
	    {
	        Node prev = null;
	        Node current = node;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			int t=sc.nextInt();
			while(t-->0) {
				OddEvenLL list = new OddEvenLL();
				int n =sc.nextInt();
				for(int i=0;i<n;i++) {
					int data=sc.nextInt();
					list.insertend(data);
				}
				list.segregateOddEven();
				list.printall();
			}
	}

}
