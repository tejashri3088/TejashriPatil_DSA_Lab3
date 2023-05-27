package gl.g4.balancingbrackets.main;

import gl.g4.balancingbrackets.checkbalance.CheckBalance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bracketExpression = "([[{}]])";

		CheckBalance checkBalance = new CheckBalance();
		checkBalance.checkBalance(bracketExpression);

	}
}
