package hlieb.model;

public enum Counter {
	INSTANCE(Person.getCount(), Team.getCount(), Camo.getCount(), Unit
			.getCount(), Conflict.getCount());
	private long personCount;
	private long teamCount;
	private long camoCount;
	private long unitCount;
	private long conflictCount;
	
	private Counter(long personCount, long teamCount, long camoCount,
			long unitCount, long conflictCount) {
		this.personCount = personCount;
		this.teamCount = teamCount;
		this.camoCount = camoCount;
		this.unitCount = unitCount;
		this.conflictCount = conflictCount;
	}

	public long getPersonCount() {
		return personCount;
	}

	public long getTeamCount() {
		return teamCount;
	}

	public long getCamoCount() {
		return camoCount;
	}

	public long getUnitCount() {
		return unitCount;
	}

	public long getConflictCount() {
		return conflictCount;
	}

}
