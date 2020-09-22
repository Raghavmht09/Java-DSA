package Stacks;

	import java.util.Stack;
	public class MinElement {
	private Stack<Integer> st;
	private Stack<Integer> minSt;
	public MinElement() {
	st = new Stack<>();
	minSt = new Stack<>();
	}
	public void push(int data) {
	int min = data;
	if(!minSt.isEmpty() && min > minSt.peek()) {
	min = minSt.peek();
	}
	st.push(data);
	minSt.push(min);
	}
	public void pop() {
	st.pop();
	minSt.pop();
	}
	public int top() {
	return st.peek();
	}
	public int getMinimum() {
	return minSt.peek();
	}
	public static void main(String[] args) {
	MinElement minElem = new MinElement();
	minElem.push(10);
	minElem.push(5);
	minElem.push(8);
	minElem.push(0);
	minElem.pop();
	System.out.println(" Minimum Element from Stack " + minElem.getMinimum());
	}
	}