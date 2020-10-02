package linkedLists;

public class Main {

	public static void main(String[] args) {
	linkedlist list = new linkedlist();
	list.insertbeg(1);
	list.insertend(4);
	list.insert(1, 2);
	list.insert(2, 3);
	list.printall();
	list.delete(3);
	list.printall();
	}

}
