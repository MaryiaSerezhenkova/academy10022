package Storage;

import java.util.ArrayList;
import java.util.List;

import Storage.api.IMenuStorage;
import api.IMenu;
import core.Menu;
import core.MenuRow;

public class MenuStorage implements IMenuStorage {

	private final List<IMenu> menu = new ArrayList<>();
	private static final IMenuStorage instance = new MenuStorage();

	public MenuStorage() {
	}


	@Override
	public List<IMenu> get() {
		return this.menu;
	}

	@Override
	public IMenu get(Long id) {
		for (int i = 0; i < menu.size(); i++) {
			if (((Menu) menu.get(i)).getId() == id) {
				return menu.get(i);
			}
		}
		return null;

	}

	@Override
	public void delete(Long id) {
		for (int i = 0; i < menu.size(); i++) {
			if (((Menu) menu.get(i)).getId() == id) {
				menu.remove(i);
			}
		}
	}

	@Override
	public void add(MenuRow menuRow, Long menuId) {
		if (menuRow.getId() != null) {
			throw new IllegalStateException("Error. Id should be empty");
		}
		Menu temp = (Menu) menu;
		temp.setId((long) (menu.size() + 1));
		this.menu.add(temp);
	}


	public static IMenuStorage getInstance() {
		return instance;
	}


}
