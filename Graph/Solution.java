import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();
        for(int src = 0;src<graph.length;src++){
            if(visited.containsKey(src)) continue;
            q.add(new BipartitePair(src, 0));
            while(!q.isEmpty()){
                // 1. remove
                BipartitePair rv = q.poll();

                // 2. Ignore if already visited
                if(visited.containsKey(rv.vrtx)){
                    if(visited.get(rv.vrtx) != rv.distance){
                        return false;
                    }
                    else continue;
                }

                // 3. mark visited
                visited.put(rv.vrtx, rv.distance);

                // 5. add unvisited nbrs
                for(int nbrs : graph[rv.vrtx]){
                    if(!visited.containsKey(nbrs)){
                        BipartitePair np = new BipartitePair(nbrs, rv.distance+1);
                        q.add(np);
                    }
                }
            }
        }
        return true;
    }
    class BipartitePair{
        int vrtx;
        int distance;
        public BipartitePair(int vrtx, int distance){
            this.vrtx = vrtx;
            this.distance = distance;
        }
    }
}
