package Sprint4.Stack1;

public class Stack_1_Test {

	public static void main(String[] args) {
		Stack_1 stack = new Stack_1();
		
		System.out.println(stack.push("0"));
		System.out.println("Size: " + stack.size());
		System.out.println(stack.push("1"));
		System.out.println("Size: " + stack.size());
		System.out.println(stack.push("12"));
		System.out.println("Size: " + stack.size());
		System.out.println(stack.push("7"));
		System.out.println("Size: " + stack.size());
		System.out.println(stack.push("4"));
		System.out.println("Size: " + stack.size());
		System.out.println(stack.push("5")); // Should not add this!
//		stack.clear();
		System.out.println("Size: " + stack.size());
		stack.showElements();
		System.out.println("Capacity: " + stack.getCapacity());
		System.out.println("Empty: " + stack.isEmpty());
		System.out.println("Full: " + stack.isFull());
		System.out.println("Size: " + stack.size());
		stack.showElements();
		
		System.out.println("***********");
		System.out.println("Pop: " + stack.pop());
		System.out.println("Size: " + stack.size());
		System.out.println("Full: " + stack.isFull());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Size: " + stack.size());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Size: " + stack.size());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Size: " + stack.size());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Size: " + stack.size());
		System.out.println("Pop: " + stack.pop()); // Should return null
		System.out.println("Size: " + stack.size());
		System.out.println("Empty: " + stack.isEmpty());
		System.out.println("Full: " + stack.isFull());
		stack.showElements();
		System.out.println("***********");
		System.out.println(stack.push("5"));
		System.out.println("Size: " + stack.size());
		System.out.println("Full: " + stack.isFull());
		System.out.println("Empty: " + stack.isEmpty());
		stack.clear();
		System.out.println("***********");
		stack.showElements();
	}

}