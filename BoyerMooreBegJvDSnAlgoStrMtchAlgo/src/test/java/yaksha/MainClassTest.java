package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import org.junit.jupiter.api.Test;

class MainClassTest {

	@Test
	public void testExceptionConditon() throws Exception {
		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {
		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	void testFindPattern() throws Exception {
		// Test will pass
		String text = "abcdefghijklmnopqrstuvwxyz";
		String pattern = "qrstuv";
		String receivedResult = null;
		String expectedResult = "Pattern found at position : 16";
		BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
		int pos = BoyerMooreBO.findPattern(boyerMoore);
		if (pos == -1) {
			receivedResult = "No Match";
		} else {
			receivedResult = "Pattern found at position : " + pos;
		}
		yakshaAssert(currentTest(), (expectedResult.equals(receivedResult) ? "true" : "false"), businessTestFile);
	}
}
