package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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


//	・初期状態で、incrementメソッドを実行すると１が取得できる
	@Test
	void testIncrement() {
		Counter counter = new Counter();
		assertEquals(1, counter.increment(),"エラーが発生しました");
	}
	
	@Test
	void testIncrement2() {
		Counter counter = new Counter();
		counter.increment();
		assertEquals(2, counter.increment(),"エラーが発生しました");
	}
	@Test
	void testIncrement3() {
		Counter counter = new Counter();
		for(int i = 0;i<50;i++) {
			counter.increment();
		}
		assertEquals(51, counter.increment(),"エラーが発生しました");
	}
	

}
