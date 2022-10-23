package Services;

import java.util.List;

import Services.api.IMenuService;
import Storage.MenuStorage;
import Storage.api.IMenuStorage;
import api.IMenu;
import core.Menu;
import core.MenuCreator;
import core.dto.MenuRowDTO;

public class MenuService implements IMenuService {

    private IMenuStorage storage;
	private static MenuService instance=null ;

	private MenuService() {
        this.storage = MenuStorage.getInstance();
    }
  
    public static MenuService getInstance() {
        synchronized (MenuService.class) {
            if (instance == null) {
                instance = new MenuService();
            }
        }
        return instance;
    }

//    @Override
//    public List<Menu> get() {
//        return this.storage.get();
//    }
//
//    @Override
//    public IMenu get(Long id) {
//        try {
//            return this.dao.get(id);
//        } catch (SQLException e) {
//            throw new RuntimeException("Failed to get Menu with id " + id,e);
//        }
//    }
//
//    @Override
//    public Boolean isIdValid(Long id) {
//        return this.dao.isIdExist(id);
//    }
//
//    @Override
//    public Boolean isDishExist(String name) {
//        return this.dao.isDishExist(name);
//    }
//
//    @Override
//    public void add(List<MenuItemDto> menuItemDto) {
//        this.validator.validateMenu(menuItemDto);
//        try {
//            this.dao.save(MenuMapper.menuMapping(menuItemDto));
//        } catch (SQLException e) {
//            throw new IncorrectSQLConnectionException("Failed to save new Menu", e);
//        }
//    }
//
//    @Override
//    public void addMenuItem(MenuItemDtoWithId menuItemDtoWithId) {
//        this.validator.validateMenuItem(menuItemDtoWithId);
//        this.dao.add(MenuMapper.menuItemWithIdMapping(menuItemDtoWithId), menuItemDtoWithId.getId());
//    }

	@Override
	public void add(List<MenuRowDTO> menuRowDto) {
		this.storage.add(MenuCreator.menuCreator(menuRowDto), null);
		
	}

	@Override
	public void addMenuItem(MenuRowDTO menuRowDTO) {
		this.storage.add(MenuCreator.menuCreator(menuRowDTO), null);
		
	}

	@Override
	public List<Menu> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMenu get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isIdValid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isDishExist(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}