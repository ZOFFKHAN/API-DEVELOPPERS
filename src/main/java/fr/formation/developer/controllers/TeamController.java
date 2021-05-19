package fr.formation.developer.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developer.domain.dtos.Team;
import fr.formation.developer.services.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService service;

    public TeamController(TeamService service) {
	this.service = service;
    }

    @GetMapping("/{name}")
    public Team getById(@Valid @PathVariable("name") String name) {
	return service.getById(name);

    }

    @PostMapping

    public void create(@Valid @RequestBody Team team) {
	service.create(team);
	System.out.println(team);
    }

    // name already exist , no use to add in @body

    @DeleteMapping("/{name}")
    public void deleteTeam(@PathVariable("name") String name) {
	service.deleteTeam(name);
	System.out.println("Delete Team: " + name);

    }

}
