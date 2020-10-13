package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
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
	public void testCountNodes() throws Exception {
		BST bst = new BST();
		bst.insert(8);
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(10); 
		bst.insert(15);
		bst.insert(2);
		yakshaAssert(currentTest(), (bst.countNodes() == 7 ? "true" : "false"), businessTestFile);
	}

	@Test
	public void testSearch() throws Exception {
		BST bst = new BST();
		bst.insert(8);
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(10);
		bst.insert(15);
		bst.insert(2);
		yakshaAssert(currentTest(), (bst.search(7) == true ? "true" : "false"), businessTestFile);
	}
}