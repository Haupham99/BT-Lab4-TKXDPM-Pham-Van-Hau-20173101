package test.get.total.cost;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.oms.bean.Book;
import com.oms.bean.Order;
import com.oms.serverapi.MediaApi;

public class TotalCostBlackBoxTest {
	private MediaApi api = new MediaApi();
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetTotalCost() {
		ArrayList<Book> list= api.getBooks(null);
		Order order = new Order();
		double total = 0;
		for(int i = 0; i < list.size(); i++) {
		    total += total + list.get(i).getCost();
		}
		double totalTest = order.getTotalCost();
		System.out.println(total);
		System.out.println(totalTest);
//		assertEquals("Error in getBooks API!", list.size(), 3);
		assertEquals("Error in getTotalCost API!", total, totalTest);
	}
}
