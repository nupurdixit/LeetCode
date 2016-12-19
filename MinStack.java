package LeetCode;

import java.util.LinkedList;

/* Min Stack
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */
public class MinStack {
	LinkedList<Integer> l1=new LinkedList<>();
	LinkedList<Integer> l2=new LinkedList<>();
	int min;
	public MinStack(){
		min=Integer.MIN_VALUE;
	}
	
	public void push(int x){
		if(l2.isEmpty()){ 
			l2.add(x);
		}
		else{
			if(x<=l2.get(l2.size()-1)){
				l2.add(x);
			}
		}
		l1.add(x);
	}
	
	public int pop(){
		if(l1.isEmpty()){
			return 0;
		}
		if(top()==l2.get(l2.size()-1)){
			l2.remove(l2.size()-1);
		}
		int pop=l1.remove(l1.size()-1);
		return pop;
	}
	
	
	public int getMin(){
		return l2.get(l2.size()-1);
	}
	
	public int top(){
		if(!l1.isEmpty()){
			return l1.get(l1.size()-1);
		}
		return 0;
		
	}
//	private Exception RuntimeException(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack m=new MinStack();
		m.push(12);
		m.push(-1);
		m.push(0);
		m.push(7);
		System.out.println(m.pop());
		System.out.println(m.getMin());
		System.out.println(m.pop());
		System.out.println(m.getMin());
		System.out.println(m.pop());
		System.out.println(m.getMin());
	}

}
