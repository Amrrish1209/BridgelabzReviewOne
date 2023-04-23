package com.bridgelabz.review;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {

	public static void main(String[] args) {

		System.out.println("List:");
		// List interface implementation with lambda expression and method reference
		List<String> list = Arrays.asList("apple", "banana", "orange");
		list.forEach(System.out::println);

		System.out.println();
		System.out.println("ArrayList:");
		// Creating an ArrayList
		ArrayList<String> fruits = new ArrayList<>();
		// Adding elements to the ArrayList using the add() method
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		// Printing the ArrayList using a for-each loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		// Using the remove() method to remove an element from the ArrayList
		fruits.remove("Banana");
		System.out.println("After removing Banana:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println();

		System.out.println("LinkedList:");
		// Creating a LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		// Adding elements to the LinkedList using the add() method
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		// Using the indexOf() method to get the index of an element in the LinkedList
		int index = linkedList.indexOf("Orange");
		System.out.println("The index of Orange is: " + index);
		System.out.println();

		System.out.println("Vector:");
		// Creating a Vector
		Vector<String> vector = new Vector<>();
		// Adding elements to the Vector using the add() method
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Orange");
		// Using the subList() method to get a sub-list of elements from the Vector
		List<String> subList = vector.subList(0, 2);
		System.out.println("Sub-list of fruits: " + subList);
		System.out.println();

		System.out.println("Stack:");
		// Creating a Stack
		Stack<String> stack = new Stack<>();
		// Pushing elements to the Stack using the push() method
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Orange");
		// Using the pop() method to remove and return the top element from the Stack
		String poppedElement = stack.pop();
		System.out.println("Popped element: " + poppedElement);
		System.out.println("Stack after popping:");
		for (String fruit : stack) {
			System.out.println(fruit);
		}
		System.out.println();

		System.out.println("Queue:");
		// Queue interface implementation with PriorityQueue
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(2);
		queue.offer(1);
		queue.offer(3);
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Deque:");
		// Creating a Deque
		Deque<String> deque = new ArrayDeque<>();
		// Adding elements to the front and back of the Deque using the addFirst() and
		// addLast() methods
		deque.addFirst("Apple");
		deque.addLast("Orange");
		deque.addFirst("Banana");
		// Using the removeFirst() and removeLast() methods to remove elements from the
		// Deque
		deque.removeFirst();
		deque.removeLast();
		System.out.println("After removing first and last elements:");
		for (String fruit : deque) {
			System.out.println(fruit);
		}
		System.out.println();

		System.out.println("Set:");
		// Set interface implementation with streams and method chaining
		Set<Integer> set = Arrays.asList(1, 2, 3, 2, 4, 5, 5).stream().filter(n -> n > 2).collect(Collectors.toSet());
		System.out.println(set);
		System.out.println();

		System.out.println("HashSet:");
		// Creating a HashSet
		HashSet<String> hashSet = new HashSet<>();

		// Adding elements to the HashSet using the add() method
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		// Using the contains() method to check if an element is present in the HashSet
		boolean contains = hashSet.contains("Orange");
		System.out.println("Does HashSet contain Orange? " + contains);
		System.out.println();

		System.out.println("SortedSet:");
		// SortedSet interface implementation with TreeSet
		SortedSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(3);
		sortedSet.add(1);
		sortedSet.add(2);
		System.out.println(sortedSet);
		System.out.println();

		System.out.println("TreeSet:");
		// Creating a TreeSet
		TreeSet<String> treeSet = new TreeSet<>();
		// Adding elements to the TreeSet using the add() method
		treeSet.add("Apple");
		treeSet.add("Banana");
		treeSet.add("Orange");
		// Using the headSet() and tailSet() methods to get subsets of the TreeSet
		SortedSet<String> headSet = treeSet.headSet("Banana");
		SortedSet<String> tailSet = treeSet.tailSet("Banana");
		System.out.println("Head set: " + headSet);
		System.out.println("Tail set: " + tailSet);
	}
}
