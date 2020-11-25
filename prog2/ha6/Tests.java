import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

public class Tests {

	@Test
	public void testStackPush() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		assertEquals("** 2 **\n** 1 **\n*******", stack.toString());
	}

	@Test(expected = EmptyStackException.class)
	public void testStackPopNull() {
		Stack stack = new Stack();
		stack.pop();
	}
	
	@Test
	public void testStackPop() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.pop());
	}
	
	@Test
	public void testStackEmpty() {
		Stack stack = new Stack();
		assertEquals(true, stack.isEmpty());
	}
	
	@Test
	public void testStackNotEmpty() {
		Stack stack = new Stack();
		stack.push(1);
		assertEquals(false, stack.isEmpty());
	}
	
	@Test(expected = EmptyStackException.class)
	public void testStackTopEmpty() {
		Stack stack = new Stack();
		stack.top();
	}
	
	@Test
	public void testStackTopNotEmpty() {
		Stack stack = new Stack();
		stack.push(1);
		assertEquals(1, stack.top());
	}

}