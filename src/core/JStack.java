package core;

/*
 * Praphon Khaosaard
 * ID 6509611858
 * */


import java.util.*;
public class JStack implements IStack {
	Stack<Object> s1;

	public JStack() {
		s1 = new Stack<>();
	}

	public boolean isEmpty() {
		if (s1.size() == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (s1.size() >= 10) { // assume size = 10 element
			return true;
		} else {
			return false;
		}
	}
	public int getSize() {
		return s1.size();
	}

	public void pushEleToTop(Object o) {
		if (!isFull()) {
			s1.push(o);
		}
	}

	public Object topStack() {
		return s1.peek();
	}

	public Object popEleFromTop() {
		if (!isEmpty()) {
			return s1.pop();
		}
		return null;
	}
}
