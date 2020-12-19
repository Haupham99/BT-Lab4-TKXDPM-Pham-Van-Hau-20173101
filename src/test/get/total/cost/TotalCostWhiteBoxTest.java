package test.get.total.cost;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.oms.bean.Book;
import com.oms.serverapi.MediaApi;

public class TotalCostWhiteBoxTest {
	private MediaApi api = new MediaApi();
	
	@Test
	public void testGetTotalCost() {
		ArrayList<Book> list= api.getBooks(null);
		int total = 0;
		assertEquals("Error in getBooks API!", list.size(), 3);
	}
}
