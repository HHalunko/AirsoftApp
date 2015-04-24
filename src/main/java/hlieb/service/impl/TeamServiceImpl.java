package hlieb.service.impl;

import hlieb.dao.TeamDAO;
import hlieb.model.Team;
import hlieb.service.TeamService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamDAO dao;

	@Override
	@Transactional
	public void saveTeam(Team team) {
		dao.save(team);
	}

	@Override
	public Team getTeam(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Team> getAllTeams() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Team editTeam(Integer id, Team team) {
		Team newTeam = dao.findOne(id);
		newTeam.setTeamName(team.getTeamName());
		return dao.save(newTeam);
	}

	@Override
	@Transactional
	public void deleteTeam(Integer id) {
		dao.delete(id);
	}

}
