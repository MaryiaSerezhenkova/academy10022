package core;

import java.util.List;

import api.IOrder;
import api.ISelectedItem;

public class Order implements IOrder {
	
	private List<ISelectedItem> selectedItems;

	public Order(List<ISelectedItem> selectedItems) {
		super();
		this.selectedItems = selectedItems;
	}


	public List<ISelectedItem> getSelectedItems() {
		return selectedItems;
	}


	public void setSelectedItems(List<ISelectedItem> selectedItems) {
		this.selectedItems = selectedItems;
	}


	public List<ISelectedItem> getSelected() {

		return selectedItems;
	}
	
}
