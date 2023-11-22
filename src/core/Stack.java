package core;

import java.util.ArrayList;

public class Stack implements IStack {

	private ArrayList<Object> stack;
	private Object top;
	
	int popped;
	
	public Stack() {
		stack = new ArrayList<Object>();
	}
	
	
	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return stack.size();
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(Object elm) {
		stack.add(elm);
		top = elm;
		
	}

	@Override
	public Object Top() {
		// TODO Auto-generated method stub
		return top;
	}

}
