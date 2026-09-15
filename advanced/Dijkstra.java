/**
 * 15 - Dijkstra
 * Shortest paths from a source node with Dijkstra's algorithm using a
 * PriorityQueue. Graph is an adjacency list; weights must be >= 0.
 *
 * Concepts: graphs, adjacency lists, priority queue, greedy relaxation.
 *
 * Run:
 *   javac Dijkstra.java
 *   java Dijkstra
 *
 * Sample output (source = 0):
 *   Distances from 0: [0, 4, 12, 19, 21, 11, 9, 8, 14]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    static class Edge {
        int to;
        int weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static int[] shortestPaths(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        // Each entry: {node, distance}. Ordered by distance.
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{source, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0], d = cur[1];
            if (d > dist[node]) {
                continue; // stale entry, skip
            }
            for (Edge e : graph.get(node)) {
                int nd = d + e.weight;
                if (nd < dist[e.to]) {
                    dist[e.to] = nd;
                    pq.offer(new int[]{e.to, nd});
                }
            }
        }
        return dist;
    }

    static void addUndirected(List<List<Edge>> graph, int a, int b, int w) {
        graph.get(a).add(new Edge(b, w));
        graph.get(b).add(new Edge(a, w));
    }

    public static void main(String[] args) {
        // Classic 9-node example graph.
        int n = 9;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        addUndirected(graph, 0, 1, 4);
        addUndirected(graph, 0, 7, 8);
        addUndirected(graph, 1, 2, 8);
        addUndirected(graph, 1, 7, 11);
        addUndirected(graph, 2, 3, 7);
        addUndirected(graph, 2, 8, 2);
        addUndirected(graph, 2, 5, 4);
        addUndirected(graph, 3, 4, 9);
        addUndirected(graph, 3, 5, 14);
        addUndirected(graph, 4, 5, 10);
        addUndirected(graph, 5, 6, 2);
        addUndirected(graph, 6, 7, 1);
        addUndirected(graph, 6, 8, 6);
        addUndirected(graph, 7, 8, 7);

        System.out.println("Distances from 0: " + Arrays.toString(shortestPaths(graph, 0)));
    }
}
