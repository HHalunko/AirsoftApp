package hlieb.model;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Conflict {
	private static int count;
	private final int id = ++count;
	//unique
	private String operationName;
	private LocalDate startDate;
	private LocalDate endDate;
	private String description;
	private Set <Unit> unitsParticipated = new TreeSet <Unit>();
	
	public Conflict() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Conflict(String operationName, LocalDate startDate,
			LocalDate endDate, String description, Set<Unit> unitsParticipated) {
		super();
		this.operationName = operationName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.unitsParticipated = unitsParticipated;
	}
	
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Unit> getUnitsParticipated() {
		return unitsParticipated;
	}
	public void setUnitsParticipated(Set<Unit> unitsParticipated) {
		this.unitsParticipated = unitsParticipated;
	}
	public void addParticipatingUnit(Unit unit){
		this.unitsParticipated.add(unit);
		unit.addConflict(this);
	}
	public static int getCount() {
		return count;
	}
	public int getId() {
		return id;
	}
	
}
