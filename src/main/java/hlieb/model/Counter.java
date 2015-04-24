package hlieb.model;

public class /* enum */Counter {
	// INSTANCE(Person.getCount(), Team.getCount(), Camo.getCount(), Unit
	// .getCount(), Conflict.getCount());

	private static long personCount = Person.getCount();
	private static long teamCount = Team.getCount();
	private static long camoCount = Camo.getCount();
	private static long unitCount = Unit.getCount();
	private static long conflictCount = Conflict.getCount();

	private Counter() {
		super();
	}

	private Counter(long personCount, long teamCount, long camoCount,
			long unitCount, long conflictCount) {
//		this.personCount = personCount;
//		this.teamCount = teamCount;
//		this.camoCount = camoCount;
//		this.unitCount = unitCount;
//		this.conflictCount = conflictCount;
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

	public static String getCount() {
		return "Counter [personCount=" + personCount + ", teamCount="
				+ teamCount + ", camoCount=" + camoCount + ", unitCount="
				+ unitCount + ", conflictCount=" + conflictCount + "]";
	}

}
