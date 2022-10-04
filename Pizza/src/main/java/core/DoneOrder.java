package core;

import java.util.ArrayList;
import java.util.List;

import api.IDoneOrder;
import api.IPizza;
import api.ITicket;

public class DoneOrder implements IDoneOrder {
	
	private ITicket ticket;
	private List<IPizza> doneOrder = new ArrayList<IPizza>();

	public ITicket getTicket() {
		return ticket;
	}

	public List<IPizza> getItems() {
		return doneOrder ;
	}

}
