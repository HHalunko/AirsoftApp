package hlieb.model;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;
import javax.persistence.*;

@Entity
@Table(name = "Conflict")
public class Conflict implements Comparable<Conflict> {
	@Transient
	private static long count;
	@Id
	@Column(name = "id_Conflict")
	private final long id = ++count;
	// unique
	@Column(name = "name_Conflict")
	private String operationName;
	@Transient
	private LocalDate startDate;
	@Transient
	private LocalDate endDate;
	@Column(name = "description_Conflict")
	private String description;
	@Column(name = "start_Conflict")
	private String start;
	@Column(name = "end_Conflict")
	private String end;
	@Transient
	private Set<Unit> unitsParticipated = new TreeSet<Unit>();

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
		this.start = startDate.toString();
		this.end = endDate.toString();
	}

	public Conflict(String operationName, LocalDate startDate,
			LocalDate endDate, String description) {
		super();
		this.operationName = operationName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.start = startDate.toString();
		this.end = endDate.toString();
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

	public void addParticipatingUnit(Unit unit) {
		this.unitsParticipated.add(unit);
		unit.addConflict(this);
	}

	public static long getCount() {
		return count;
	}

	public long getId() {
		return id;
	}

	@Override
	public int compareTo(Conflict o) {
		if (this.id - o.id > 0)
			return -1;
		else if (this.id - o.id < 0)
			return 1;
		else
			return 0;
	}

}
