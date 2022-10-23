package core;

import java.util.ArrayList;
import java.util.List;

import api.IMenu;
import api.IMenuRow;

public class Menu implements IMenu{
	
	private Long id;
	private List<IMenuRow> menu = new ArrayList<IMenuRow>();
	
	public Menu(Long id, List<IMenuRow> menu) {
		super();
		this.id = id;
		this.menu = menu;
	}

	public Menu(List<IMenuRow> menu) {
		super();
		this.menu = menu;
	}

	public List<IMenuRow> getItems() {
		return this.menu;
	}

	public void setMenu(List<IMenuRow> menu) {
		this.menu = menu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<IMenuRow> getMenu() {
		return menu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu [id=");
		builder.append(id);
		builder.append(", menu=");
		builder.append(menu);
		builder.append("]");
		return builder.toString();
	}

}
