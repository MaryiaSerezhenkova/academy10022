package Services.api;

import java.util.List;

import api.IMenu;
import core.Menu;
import core.dto.MenuRowDTO;

public interface IMenuService {
    void add(List<MenuRowDTO> menuRowDto);
    void addMenuItem(MenuRowDTO menuRowDTO);
    List<Menu> get();
    IMenu get(Long id);
    Boolean isIdValid(Long id);
    Boolean isDishExist(String name);
}