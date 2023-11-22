package core;
import java.util.*;

public interface IStack {
	public boolean isEmpty();
	public boolean isFull();
	public int getSize();	
	public void pushEleToTop(Object o);
	public Object popEleFromTop();
	public Object topStack();
}
