package yaksha;

public class GraphAdjacencyMatrix {
	private final int vertices;
	private int[][] adjacency_matrix;

	public GraphAdjacencyMatrix(int v) {
		vertices = v;
		adjacency_matrix = new int[vertices + 1][vertices + 1];
	}

	public void makeEdge(Graph graph) {
		int to = graph.getTo();
		int from = graph.getFrom();
		int edge = graph.getEdge();

		try {
			adjacency_matrix[to][from] = edge;
		} catch (ArrayIndexOutOfBoundsException index) {
			System.out.println("The vertices does not exists");
		}
	}

	public int getEdge(Graph graph) {

		int to = graph.getTo();
		int from = graph.getFrom();

		try {
			return adjacency_matrix[to][from];
		} catch (ArrayIndexOutOfBoundsException index) {
			System.out.println("The vertices does not exists");
		}
		return -1;
	}
}