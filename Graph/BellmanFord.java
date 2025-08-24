import java.util.*;
public class BellmanFord{
    HashMap<Integer, HashMap<Integer, Integer>> map;
	public BellmanFord(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
    }
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
	}

	public void BellManFordAlgo(int src){
		int v = map.size();
		int[] dis = new int[v+1]; // distance array
		for (int i = 1; i < dis.length; i++) {
			dis[i] = 1000_000;
		}
		dis[src] = 0;
		List<EdgePair> ll = getalledge();
		for(int i = 1;i<=v;i++){
			for ( EdgePair e : ll) {
                if(i == v && dis[e.e2]>dis[e.e1]+e.cost) {
                    System.out.println("-ve wt cycle");
                    return;
                }
				else if(dis[e.e2]>dis[e.e1]+e.cost){
					dis[e.e2]=dis[e.e1]+e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i]+" ");
		}
	}
    public class EdgePair {

		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.cost = cost;
			this.e1 = e1;
			this.e2 = e2;
		}

		@Override
		public String toString() {
			return e1 + " - " + e2 + " @ " + cost;
		}

	}

	public ArrayList<EdgePair> getalledge() {
		ArrayList<EdgePair> list = new ArrayList<>();

		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {

				EdgePair eg = new EdgePair(e1, e2, map.get(e1).get(e2));
				list.add(eg);

			}

		}
		return list;
	}
	public static void main(String[] args) {
		BellmanFord bf = new BellmanFord(5);
		bf.AddEdge(1, 2, 8);
		bf.AddEdge(1, 3, 4);
		bf.AddEdge(1,4,5);
		bf.AddEdge(3,4,-3);
		bf.AddEdge(4, 5, 4);
		bf.AddEdge(5, 2, 1);
        // bf.AddEdge(2, 5, -2);
		bf.AddEdge(2, 5, -2);
		bf.BellManFordAlgo(1);
	}
}
