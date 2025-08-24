import java.util.*;

public class Prims_algo {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prims_algo(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public int Prims() {
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost - o2.cost; // min-heap by cost
            }
        });

        int sum = 0;
        pq.add(new PrimsPair(1, 1, 0)); // start from vertex 1

        while (!pq.isEmpty()) {
            PrimsPair rp = pq.poll();

            if (visited.contains(rp.vrtx)) {
                continue;
            }

            visited.add(rp.vrtx);
            System.out.println(rp);
            sum += rp.cost;

            for (int nbrs : map.get(rp.vrtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = map.get(rp.vrtx).get(nbrs);
                    pq.add(new PrimsPair(nbrs, rp.vrtx, cost));
                }
            }
        }
        return sum;
    }

    class PrimsPair {
        int vrtx;
        int acqvrtx;
        int cost;

        public PrimsPair(int vrtx, int aqvrtx, int cost) {
            this.vrtx = vrtx;
            this.acqvrtx = aqvrtx;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.vrtx + " " + this.acqvrtx + " @ " + this.cost;
        }
    }

    public static void main(String[] args) {
        Prims_algo pp = new Prims_algo(7);

        pp.AddEdge(1, 2, 2);
        pp.AddEdge(1, 4, 5);
        pp.AddEdge(2, 3, 5);
        pp.AddEdge(4, 3, 4);
        pp.AddEdge(4, 5, 7);
        pp.AddEdge(5, 6, 1);
        pp.AddEdge(5, 7, 6);
        pp.AddEdge(6, 7, 8);

        System.out.println("Minimum Cost: " + pp.Prims());
    }
}
