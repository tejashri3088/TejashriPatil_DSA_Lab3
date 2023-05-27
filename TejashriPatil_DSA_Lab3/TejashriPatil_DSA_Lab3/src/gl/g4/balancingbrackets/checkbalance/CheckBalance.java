package gl.g4.balancingbrackets.checkbalance;

import java.util.Stack;

public class CheckBalance {

	public void checkBalance(String brackets) {

		Stack<Character> stack = new Stack<Character>();
		char character, popped;
		boolean isBalanced = true;

		for (int i = 0; i < brackets.length(); i++) {

			character = brackets.charAt(i);

			if (character == '(' || character == '{' || character == '[') {
				stack.push(character);

			} else {

				if (stack.isEmpty()) {
					isBalanced = false;
					break;
				}

				popped = stack.pop();

				if (character == ')' && popped == '(') {
					continue;
				} else if (character == '}' && popped == '{') {
					continue;
				} else if (character == ']' && popped == '[') {
					continue;
				} else {
					isBalanced = false;
					break;
				}
			}
		}

		if (!stack.isEmpty() || isBalanced == false) {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		} else {
			System.out.println("The entered String has Balanced Brackets");
		}
	}
}
