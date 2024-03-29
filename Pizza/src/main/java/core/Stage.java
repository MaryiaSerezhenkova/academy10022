package core;

import java.time.LocalTime;

import api.IStage;

public class Stage implements IStage {
	
	private String description;
	private LocalTime start;

	public String getDescription() {
		return description;
	}

	public LocalTime getTime() {
		return start;
	}

	public LocalTime getStart() {
		return start;
	}

	public void setStart(LocalTime start) {
		this.start = start;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Stage(String description, LocalTime start) {
		super();
		this.description = description;
		this.start = start;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stage other = (Stage) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

}
