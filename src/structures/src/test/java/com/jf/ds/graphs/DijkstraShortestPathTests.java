package com.jf.ds.graphs;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class DijkstraShortestPathTests {

	@Test
	public void test() {
		
		DirectedGraph<DirectedWeightedEdge> digraph = new DirectedGraph<DirectedWeightedEdge>(6);
		
		digraph.addEdge(new DirectedWeightedEdge(0, 1, 7));
		digraph.addEdge(new DirectedWeightedEdge(0, 2, 9));
		digraph.addEdge(new DirectedWeightedEdge(0, 5, 14));
		digraph.addEdge(new DirectedWeightedEdge(1, 2, 10));
		digraph.addEdge(new DirectedWeightedEdge(1, 3, 15));
		digraph.addEdge(new DirectedWeightedEdge(2, 3, 11));
		digraph.addEdge(new DirectedWeightedEdge(2, 5, 2));
		digraph.addEdge(new DirectedWeightedEdge(3, 4, 6));
		digraph.addEdge(new DirectedWeightedEdge(4, 5, 9));
		
		int start = 0;
		int end = 5;
		int dist = 9 + 2;
		
		DijkstraShortestPath path = new DijkstraShortestPath(digraph, start);
		
		assertTrue(path.hasPathTo(end));
		assertEquals(dist, (int)path.distTo(end));
		
		Stack<DirectedWeightedEdge> stack = (Stack<DirectedWeightedEdge>)path.pathTo(end);
		
		assertEquals(new DirectedWeightedEdge(0, 2, 9), stack.pop());
		assertEquals(new DirectedWeightedEdge(2, 5, 2), stack.pop());
	}

}
