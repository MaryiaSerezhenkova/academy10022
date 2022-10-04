package core;

import api.IPizza;

public class Pizza implements IPizza {
	
	private Order order;

	public String getName() {
		
		return order.getSelectedItems().getClass().getName();
	}

	public int getSize() {
		return 0;
//	return order.getSelectedItems().getClass().
	}

}
