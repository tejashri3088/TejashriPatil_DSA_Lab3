package gl.g4.pairsofsum.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import gl.g4.pairsofsum.findpairs.FindPairs;
import gl.g4.pairsofsum.node.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Node root = null;

		FindPairs findPairs = new FindPairs();

		root = new Node(40);
		Node left = new Node(20);
		Node right = new Node(60);
		root.left = left;
		root.right = right;
		left.left = new Node(10);
		left.right = new Node(30);
		right.left = new Node(50);
		right.right = new Node(70);

		System.out.println("Enter the sum");
		int sum = input.nextInt();

		Set<Integer> set = new HashSet<Integer>();
		List<String> list = new ArrayList<String>();

		findPairs.findPairs(root, sum, set, list);

		if (!list.isEmpty()) {
			for (String str : list) {
				System.out.println(str);
			}
		} else {
			System.out.println("nodes are not found.");
		}

		input.close();
	}
}
