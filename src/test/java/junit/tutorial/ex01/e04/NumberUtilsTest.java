package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
//	・入力値に「１０」を与えると、trueを返す
//	・入力値に「７」を与えると、falseを返す
	void testIsEven() {
		assertEquals(true,NumberUtils.isEven(10),"エラーが発生しました");
	}
	
	@Test
//	・入力値に「１０」を与えると、trueを返す
//	・入力値に「７」を与えると、falseを返す
	void testIsEven2() {
		assertEquals(false,NumberUtils.isEven(7),"エラーが発生しました");
	}

}
