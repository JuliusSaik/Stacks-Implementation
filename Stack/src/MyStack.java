
public class MyStack<T> {

	
	public static void main(String[] args) {
		
		MyStack<String> stack = new MyStack<String>();
		
		stack.push("jul");
		stack.push("is");
		stack.push("a");
		stack.push("stud");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());

		
	}

	public static class Node<T>{
	
		private T data;
		private Node<T>next;
		private Node(T data) {
			this.data = data;
		}
		
	}
	
	private Node<T> top;
	
	public boolean isEmpty() {
		return top == null;
	}

	public T peek() {
		return top.data;
	}
	
	public void push(T data) {
		Node<T> node = new Node<T>(data);
		node.next = top;
		top = node;
		
	}
	
	public T pop() {
		T data = top.data;
		
		if(top.next != null) {
			top = top.next;
		} else {
			top = null;
		}
		
		return data;
	}
	
	

}
