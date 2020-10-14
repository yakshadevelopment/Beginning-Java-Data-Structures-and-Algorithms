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
	void testMergeSort() throws Exception {
		MergeSort mergeSort1 = new MergeSort();
		Integer expectedResult[] = { 213, 219, 415, 615, 617, 819, 910, 1101 };
		List<Integer> expectedResultList = Arrays.asList(expectedResult);
		int[] array = { 910, 213, 1101, 415, 615, 219, 617, 819 };
		// 910 213 1101 415 615 219 617 819
		Array array1 = new Array(array, 0, array.length - 1);
		int result[] = mergeSort1.mergeSort(array1);
		List<Integer> resultList = new ArrayList<Integer>(result.length);
		for (int i : result) {
			resultList.add(i);
		}
		yakshaAssert(currentTest(), (expectedResultList.containsAll(resultList) ? "true" : "false"), businessTestFile);
	}
}
