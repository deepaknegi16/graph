package common;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {

    public ArrayList<ArrayList<Integer>> getInputList() {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        System.out.println("No of nodes and edges:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        System.out.println("Please provide the connections");
        String connection = sc.nextLine();
        while (!connection.isEmpty()) {
            int start = Integer.parseInt(connection.split(" ")[0]);
            int end = Integer.parseInt(connection.split(" ")[1]);
            graph.get(start).add(end);
            graph.get(end).add(start);
            connection = sc.nextLine();
        }
        sc.close();
        return graph;
    }

}