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

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testCalculateWaterNetworkUsingGreedyAlgo() throws Exception {
		Integer expectedResult[] = { 2, 8, 22, 3, 1, 66, 5, 6, 10 };
		List<Integer> expectedResultList = Arrays.asList(expectedResult);
		WaterConnection waterConnection;
		int n, p;
		n = 9;
		p = 6;
		int array[][] = { { 7, 4, 98 }, { 5, 9, 72 }, { 4, 6, 10 }, { 2, 8, 22 }, { 9, 7, 17 }, { 3, 1, 66 } };
		waterConnection = new WaterConnection(n, p, array);
		ArrayList<Integer> resultList = MainClass.calculateWaterNetworkUsingGreedyAlgo(waterConnection);
		yakshaAssert(currentTest(), (expectedResultList.containsAll(resultList) ? "true" : "false"), businessTestFile);
	}
}