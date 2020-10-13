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
	void testBubbleSort() throws Exception {
		int sizeOfArray = 7;
		Integer expectedResult[] = { 11, 12, 22, 25, 34, 64, 90 };
		List<Integer> expectedResultList = Arrays.asList(expectedResult);
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Input : 64 34 25 12 22 11 90
		BubbleSort bubbleSort = new BubbleSort(sizeOfArray, arr);
		int result[] = BubbleSortBO.bubbleSort(bubbleSort);
		List<Integer> resultList = new ArrayList<Integer>(result.length);
		for (int i : result) {
			resultList.add(i);
		}
		yakshaAssert(currentTest(), (expectedResultList.containsAll(resultList) ? "true" : "false"), businessTestFile);
	}
}
