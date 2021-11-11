package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.intThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
//	第２引数に０を指定してdivideを呼び出すと、IllegalArgumentExceptionが発生する
	void testDivide() {
		Calculator calculator = new Calculator();
//		try-catchで囲むと例外が起きたときは間の処理は実行されない
		try {
			int answer = calculator.divide(0, 0);
//	今回は強制的にエラーを発生させるfail（）メソッドが実行されなかった！
			fail("例外が発生しませんでした");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

	}

}
