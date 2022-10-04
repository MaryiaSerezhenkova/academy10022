package core;

import java.util.List;

import api.IOrderStatus;
import api.IStage;
import api.ITicket;

public class OrderStatus implements IOrderStatus {

	private Ticket ticket;
	private List<IStage> stage;
	int stageNumber;

	public ITicket getTicket() {
		return ticket;
	}

	public List<IStage> getHistory() {
		return stage;
	}

	public boolean isDone() {
		if (stage.get(stageNumber) == stage.get(stage.size() - 1)) {
			return true;
		}
		return false;

	}
}
