package com.jf.structures.graphs;

public class DirectedWeightedGraph extends Graph<UndirectedWeightedEdge> {

    public DirectedWeightedGraph(int V) {
        super(V);
    }

    @Override
    protected void validateVertex(UndirectedWeightedEdge e) {
        int v = e.from();
        int w = e.to();
        validateVertex(v);
        validateVertex(w);
    }

    @Override
    protected void addEdgeX(UndirectedWeightedEdge e) {

        int v = e.from();
        int w = e.to();
        adj[v].add(e);
        indegree[w]++;
    }
}