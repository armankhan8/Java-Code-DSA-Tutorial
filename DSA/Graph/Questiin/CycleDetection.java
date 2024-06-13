package DSA.Graph.Questiin;
import java.util.ArrayList;

public class CycleDetection {
    static class Edge {
        int src;
        int dst;

        Edge(int src, int dst) {
            this.dst = dst;
            this.src = src;
        }
    }

    public static void CreateGraph(ArrayList<Edge>graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }
    // O(v+e)
    public static boolean cycle(ArrayList<Edge> graph[], boolean visit[], int curr, boolean rec[]){
        System.out.print(curr + " ");
        visit[curr] = true;
        rec[curr] = true;

        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dst] == true){
                return true;
            }
            else if(!visit[e.dst]){
                if(cycle(graph, visit, e.dst, rec)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList[] graph = new ArrayList[4];        
        boolean[] visit = new boolean[V];
        boolean[] recStack = new boolean[V];

        CreateGraph(graph);
        // If more the one/ 
        for(int i = 0; i<V; i++){
            if(!visit[i]){
                boolean isCycle = cycle(graph, visit, 0, recStack);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
        // System.out.println(cycle(graph, visit, 0, recStack));
    }

}