package Storage.api;


import api.IMenu;
import core.MenuRow;

public interface IMenuStorage extends IEssenceStorage<IMenu> {
    void add(MenuRow menuRow, Long menuId);
}