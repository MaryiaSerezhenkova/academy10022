package Storage.api;

import core.PizzaInfo;

public interface IPizzaInfoStorage extends IEssenceStorage <PizzaInfo> {
	 void add (PizzaInfo type);

}