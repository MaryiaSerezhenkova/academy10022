package main.entity;

public class Employee {
	private long id;
	private String name;
	private Long job;
	private Long dep;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getJob() {
		return job;
	}
	public void setJob(Long job) {
		this.job = job;
	}
	public Long getDep() {
		return dep;
	}
	public void setDep(Long dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emplyee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", job=");
		builder.append(job);
		builder.append(", dep=");
		builder.append(dep);
		builder.append("]");
		return builder.toString();
	}
	
	

}
