package fr.formation.developer.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Team;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @GetMapping("/{name}")
    public Team getById(@Valid @PathVariable("name") String name) {

	Team team = new Team();
	team.setName("my_team");
	team.setAgile(true);
	System.out.println(team);
	return team;
    }

    @PostMapping

    public void create(@Valid @RequestBody Team team) {

	System.out.println(team);
    }

    // name already exist , no use to add in @body

    @DeleteMapping("/{name}")
    public void deleteTeam(@PathVariable("name") String name) {
	System.out.println("Delete Team: " + name);
    }

}
