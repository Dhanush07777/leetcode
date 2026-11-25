
import java.util.*;

public class bfsd {

    public static List<String> bfsd(Map<String, List<String>> graph, String start) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        List<String> traversalOrder = new ArrayList<>();

        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {

            String node = queue.poll();
            traversalOrder.add(node);

            for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        return traversalOrder;
    }

    public static void main(String[] args) {

        Map<String, List<String>> sampleGraph = new HashMap<>();

        sampleGraph.put("A", Arrays.asList("B", "C"));
        sampleGraph.put("B", Arrays.asList("A", "D", "E"));
        sampleGraph.put("C", Arrays.asList("A", "F"));
        sampleGraph.put("D", Collections.singletonList("B"));
        sampleGraph.put("E", Collections.singletonList("B"));
        sampleGraph.put("F", Collections.singletonList("C"));

        List<String> result = bfsd(sampleGraph, "B");

        System.out.println(result);
    }
}
