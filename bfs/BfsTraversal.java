package bfs;

import java.util.ArrayList;

import common.AdjacencyList;

public class BfsTraversal {

    public static void main(String[] args) {
        AdjacencyList list = new AdjacencyList();
        ArrayList<ArrayList<Integer>> graph = list.getInputList();

        for (int i = 0; i < graph.size(); i++) {
            System.out.println(graph.get(i).toString());
        }
    }
}