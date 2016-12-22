package SearchRecursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		// write your code here
		if (node == null) {
			return null;
		}
		Queue<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();
		Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
		map.put(node, new UndirectedGraphNode(node.label));
		q.add(node);
		while (!q.isEmpty()) {
			UndirectedGraphNode temp = q.poll();
			for (UndirectedGraphNode neighbour : temp.neighbors) {
				if (!map.containsKey(neighbour)) {
					map.put(neighbour, new UndirectedGraphNode(neighbour.label));
					q.add(neighbour);
				}
				map.get(temp).neighbors.add(map.get(neighbour));
			}
		}
		return map.get(node);
	}
}

class UndirectedGraphNode {
	int label;
	ArrayList<UndirectedGraphNode> neighbors;

	UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
};
