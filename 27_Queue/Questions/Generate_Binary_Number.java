package Queue.Questions;

// Java program to generate binary numbers from 1 to n

import java.util.LinkedList;
import java.util.Queue;

public class Generate_Binary_Number {
	// This function uses queue data structure to print
	// binary numbers
	static void generatePrintBinary(int n)
	{
		// Create an empty queue of strings
		Queue<String> q = new LinkedList<String>();

		// Enqueue the first binary number
		q.add("1");

		// This loops is like BFS of a tree with 1 as root
		// 0 as left child and 1 as right child and so on
		while (n-- > 0) {
			// print the front of queue
			String s1 = q.peek();
			q.remove();
			System.out.println(s1);

			// Store s1 before changing it
			String s2 = s1;

			// Append "0" to s1 and enqueue it
			q.add(s1 + "0");

			// Append "1" to s2 and enqueue it. Note that s2
			// contains the previous front
			q.add(s2 + "1");
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int n = 10;

		// Function call
		generatePrintBinary(n);
	}
}
// This code is contributed by Sumit Ghosh
