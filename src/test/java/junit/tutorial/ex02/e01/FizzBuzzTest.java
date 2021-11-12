package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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
//	１６を指定してcreateFizzBuzzListメソッドを実行すると「1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16」が取得できる
	void testCreateFizzBuzzList() {
		FizzBuzz fizzBuzz= new FizzBuzz();
//		System.out.println(fizzBuzz.createFizzBuzzList(16));
		String[] fiz16 = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16"};
		List<String> fiz16List = Arrays.asList(fiz16);
		assertIterableEquals(fiz16List,fizzBuzz.createFizzBuzzList(16),"エラーが発生しました");
	}

}
