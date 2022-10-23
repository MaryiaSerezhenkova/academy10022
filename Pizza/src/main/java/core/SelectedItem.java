package core;


import api.IMenuRow;
import api.ISelectedItem;

public class SelectedItem implements ISelectedItem {

	private Menu menu;
	private int selectedPozition;
	private int quantity;

	public IMenuRow getRow() {

		return menu.getItems().get(selectedPozition);
	}

	public int getCount() {

		return quantity;
	}

}
