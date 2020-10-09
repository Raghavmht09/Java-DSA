package linkedLists;
import java.util.*;
public class AddOnetoNum {
		private class Node{
			int data;
			Node next;
			Node(int data){
				this.data=data;
				this.next=null;
			}
			
		}
		
		
		
	
	Node head=null;
	String addNum="";
	private void addOne() {
		// TODO Auto-generated method stub
		 int num=Integer.parseInt(addNum);
	        System.out.println(num+1);
	}

	private void insertAtend(int data) {
		// TODO Auto-generated method stub
		Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            addNum=addNum.concat(String.valueOf(head.data));
            return;
        }
        Node temp=head;
        while (temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
        addNum=addNum.concat(String.valueOf(newNode.data));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AddOnetoNum list = new AddOnetoNum();
			Scanner sc = new Scanner (System.in);
			int t = sc.nextInt();
			while(t-->0) {
				int n =sc.nextInt();
				list.insertAtend(n);
				list.addOne();
				
			}
	}

}
