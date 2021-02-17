package com.mainpack;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class MySolution {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("MySolution");
		List<String> listOfItems; // to store the details of the items.

		ItemDetails details = new ItemDetails();
		listOfItems = details.setItemDetails();

		Iterator<String> itr = listOfItems.iterator(); // to iterate the list of items
		while (itr.hasNext()) {
			logger.info(itr.next());
		}

	}

}
