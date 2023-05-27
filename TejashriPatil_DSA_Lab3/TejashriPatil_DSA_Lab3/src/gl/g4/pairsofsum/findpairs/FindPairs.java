package gl.g4.pairsofsum.findpairs;

import java.util.List;
import java.util.Set;

import gl.g4.pairsofsum.node.Node;

public class FindPairs {

	public void findPairs(Node root, int sum, Set<Integer> set, List<String> list) {

		if (root == null) {
			return;
		}

		findPairs(root.left, sum, set, list);

		if (set.contains(sum - root.data)) {
			list.add("Pair is (" + (sum - root.data) + "," + root.data + ")");
		} else {
			set.add(root.data);
		}

		findPairs(root.right, sum, set, list);
	}
}
