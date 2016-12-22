package SearchRecursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

class DirectedGraphNode {
	int label;
	ArrayList<DirectedGraphNode> neighbors;

	DirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<DirectedGraphNode>();
	}
};

public class TopologicalSort {
	public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
		// write your code here
		ArrayList<DirectedGraphNode> res = new ArrayList<DirectedGraphNode>();
		if (graph.size() == 0) {
			return res;
		}
		Deque<DirectedGraphNode> q = new ArrayDeque<DirectedGraphNode>();
		Set<DirectedGraphNode> set = new HashSet<DirectedGraphNode>();
		for (DirectedGraphNode node : graph) {
			if (set.contains(node)) {
				continue;
			}
			sort(node, q, set);
		}
		for (DirectedGraphNode n : q) {
			res.add(n);
		}
		return res;
	}

	public void sort(DirectedGraphNode node, Deque<DirectedGraphNode> q, Set<DirectedGraphNode> set) {
		set.add(node);
		for (DirectedGraphNode nei : node.neighbors) {
			if (set.contains(nei)) {
				continue;
			}
			sort(nei, q, set);
		}
		q.offerFirst(node);
	}
}
