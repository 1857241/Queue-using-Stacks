
public class Queue<T> {
	Stack<T> pushStack = new Stack<T>();
	Stack<T> popStack = new Stack<T>();
	
	public void enqueue(T t) {
		pushStack.push(t);
	}
	public T dequeue() {
		if(popStack.empty()) {
			while(!pushStack.empty()) {
				popStack.push(pushStack.pop());
			}
		}
		return popStack.pop();
	}
}
