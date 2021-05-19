package fr.formation.developer.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developer.domain.dtos.Project;
import fr.formation.developer.domain.dtos.ProjectUpBudg;
import fr.formation.developer.domain.dtos.ProjectUpDesc;
import fr.formation.developer.domain.dtos.ProjectUpEndD;
import fr.formation.developer.services.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
	this.service = service;
    }

    @GetMapping("/{name}")
    public Project getById(@Valid @PathVariable("name") String name) {
	return service.getById(name);
//	Project project = new Project();
//	project.setName("test project name");
//	project.setDescription("test project description");
//	LocalDate dateBegin = LocalDate.of(2021, 01, 20);
//	project.setStartingDate(dateBegin);
//	LocalDate dateEnd = LocalDate.of(2021, 02, 20);
//	project.setEndDate(dateEnd);
//	project.setAnnualBudget(200);
//
//	System.out.println(project);
//	return project;
    }

    @PostMapping

    public void create(@Valid @RequestBody Project project) {
	service.create(project);
	System.out.println(project);
    }

    @PatchMapping("/{name}/descU")
    public void updateProjDesc(@PathVariable("name") String name, @Valid @RequestBody ProjectUpDesc newdescU) {
	service.updateProjDesc(name, newdescU);
	System.out.println(
		"Update project description : " + name + " with new description: " + newdescU.getDescription());
    }

    @PatchMapping("/{name}/budgU")
    public void updateProjBudg(@PathVariable("name") String name, @Valid @RequestBody ProjectUpBudg newbudgU) {
	System.out.println(
		"Update project annual budget : " + name + " with new annual budget: " + newbudgU.getAnnualBudget());
	service.updateProjBudg(name, newbudgU);
    }

    @PatchMapping("/{name}/clsPro")
    public void updateProjDesc(@PathVariable("name") String name, @Valid @RequestBody ProjectUpEndD closePro) {
	service.updateProjDesc(name, closePro);
	System.out.println("close project : " + name + " End date is : " + closePro.getEndDate());
    }
}
