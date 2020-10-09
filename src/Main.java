import java.util.*;


public class Main {
	 Node head= null;
	 class Node { 
	        char data; 
	        Node next; 
	  
	        Node(char data) 
	        { 
	            this.data = data; 
	            this.next = null; 
	        } 
	    } 
	 	 
	 void insertend(char data) {
		
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
	 
	 void printlist(Node head)  
	 {  
	     if (head == null)  
	     {   
	         return;  
	     }  
	     Node temp=head;
	     while (temp != null)  
	     {  
	         System.out.print(temp.data +" ");   
	   
	         temp = temp.next;  
	     }  
	     System.out.println(); 
	 }  
	   
		
	 
	  boolean isVowel(char x)  
	 {  
	     return (x == 'a' || x == 'e' || x == 'i' ||  
	             x == 'o' || x == 'u');  
	 }  
	 
	 Node arrange(Node head)  
	{  
	    Node newHead = head;  
	    Node latestVowel;   
	    Node curr = head; 
	    if (head == null)  
	        return null;  
	  
	  
	    if (isVowel(head.data) == true) {
	        latestVowel = head;  
	    }
	    else
	    { 
	        while (curr.next != null &&  
	            !isVowel(curr.next.data))  
	            curr = curr.next;  

	        if (curr.next == null)  
	            return head;  

	        latestVowel = newHead = curr.next;  
	        curr.next = curr.next.next;  
	        latestVowel.next = head;  
	    }  

	    while (curr != null && curr.next != null)  
	    {  
	        if (isVowel(curr.next.data) == true)  
	        {
	            if (curr == latestVowel)  
	            {  
	         
	                latestVowel = curr = curr.next;  
	            }  
	            else
	            {  
	
	                Node temp = latestVowel.next;  
	   
	                latestVowel.next = curr.next;  
	  
	 
	                latestVowel = latestVowel.next;  
	  
	 
	                curr.next = curr.next.next;  
	  
	
	                latestVowel.next = temp;  
	            }  
	        }  
	        else
	        {  
	            curr = curr.next;  
	        }  
	    }  
	    return newHead;  
	}  
	  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			
			int n= sc.nextInt();
			Main list= new Main();
			for(int i=0;i<n;i++) {
			
			char ch = sc.next().charAt(0);
			list.insertend(ch);
		  
			
			}
			list.printlist(list.head);
		Node newh=	list.arrange(list.head);
			list.printlist(newh);
			
		}

	}

}
