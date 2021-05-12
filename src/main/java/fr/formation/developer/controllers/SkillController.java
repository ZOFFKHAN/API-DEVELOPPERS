package fr.formation.developer.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import domain.Skill;

@RestController
public class SkillController {

    @GetMapping("/skills/{id}")
    public Skill getById(@PathVariable("id") Long id) {
	// si on met du texte alors qu'il attend un nombre erreur
	Skill skill = new Skill();
	skill.setName("spring boot " + id);
	return skill;
    }

    @PostMapping("/skills")
    public void create(@RequestBody @Valid Skill skill) {

	System.out.println(skill);
    }

}
