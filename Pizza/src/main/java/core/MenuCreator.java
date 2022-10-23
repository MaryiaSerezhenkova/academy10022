package core;

import java.util.List;
import java.util.stream.Collectors;

import api.IMenuRow;
import core.dto.MenuRowDTO;

public class MenuCreator {
	public static Menu menuCreator(List<MenuRowDTO> menuRowDto) {
        List<IMenuRow> temp = menuRowDto.stream().map(
                (i) -> new MenuRow(new PizzaInfo(i.getInfo().getName(), i.getInfo().getDescription(),
                        i.getInfo().getSize()), i.getPrice())).collect(Collectors.toList());
        return new Menu(temp);
    }

}
