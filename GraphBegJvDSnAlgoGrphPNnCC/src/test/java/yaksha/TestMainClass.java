package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestMainClass {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testGraph() throws Exception {
		int k = 0;
		Integer expectedResult[] = { 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 };
		List<Integer> expectedResultList = Arrays.asList(expectedResult);
		int result[] = new int[25];
		GraphAdjacencyMatrix graph;
		int v, e;
		v = 5;
		e = 7;
		graph = new GraphAdjacencyMatrix(v);
		Graph graph1 = new Graph(1, 1, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(2, 3, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(3, 4, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(4, 5, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(3, 5, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(1, 4, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(2, 4, 1);
		graph.makeEdge(graph1);
		for (int i = 1; i <= v; i++) {
			for (int j = 1; j <= v; j++) {
				Graph graph2 = new Graph(i, j);
				result[k] = graph.getEdge(graph2);
				k++;
			}
		}
		List<Integer> resultList = new ArrayList<Integer>(result.length);
		for (int m : result) {
			resultList.add(m);
		}
		yakshaAssert(currentTest(), (expectedResultList.containsAll(resultList) ? "true" : "false"), businessTestFile);
	}
}