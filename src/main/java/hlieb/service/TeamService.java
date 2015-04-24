package hlieb.service;

import hlieb.model.Team;

public interface TeamService {

	public void saveTeam(Team team);

	public Team getTeam(Integer id);

	public Iterable<Team> getAllTeams();

	public void deleteTeam(Integer id);

	Team editTeam(Integer id, Team team);
}
