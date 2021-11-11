package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	ItemStock itemStock;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		Item item = new Item("book",1000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		this.itemStock=itemStock;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Disabled
//	初期状態で、getNumで０が取得できる
	void testGetNum() {
		Item item = new Item("book", 1000);
		ItemStock itemStock = new ItemStock();
		assertEquals(0,itemStock.getNum(item),"エラーが発生しました");
	}
	
	@Test
	@Disabled
	
//	初期状態で、addでItemを追加するとgetNumで１が取得できる
	void testGetNum2() {
		Item item = new Item("book", 1000);
		
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		
		assertEquals(1,itemStock.getNum(item),"エラーが発生しました");
	}
	
	@Test
//	・Itemが１つ追加されている状態で、getNumで１が取得できる
	void testGetNum3() {
		Item item = new Item("book", 1000);		
		assertEquals(1,itemStock.getNum(item),"エラーが発生しました");
	}
	
	@Test
//	・Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できる
	void testGetNum4() {
		Item item = new Item("book", 1000);	
		itemStock.add(item);
		assertEquals(2,itemStock.getNum(item),"エラーが発生しました");
	}
	
	@Test
//	Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できる
	void testGetNum5() {
		Item item = new Item("text", 10000);	
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item),"エラーが発生しました");
	}
	

	
	

}
