package fr.formation.developer.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developer.domain.dtos.SkillCreate;
import fr.formation.developer.domain.dtos.SkillView;
import fr.formation.developer.services.SkillService;

@RestController
public class SkillController {

    // reference to service
    // use Autowired when initiating controller ,set an instance of
    // the Interface
    // private SkillService service; assignation

    // @Autowired // same meaning as JEE = @Inject
    // beware when using Autowired in tuto // we created a constructor in order to
    // set the skillService as final
    // see line below
    // Autowired it's not advised as we can re init the service as null
    // in the code
    private final SkillService service;

    public SkillController(SkillService service) {
	this.service = service;
    }

    @GetMapping("/skills/{id}")
    // public SkillCreate getById(@PathVariable("id") Long id) {
    public SkillView getById(@PathVariable("id") Long id) {
	// move into Skill service
	// SkillView getById(Long id)

	// si on met du texte alors qu'il attend un nombre erreur
	// change/splitted in order to use skill view tO get
	// SkillView skill = new SkillView();
	// skill.setName("spring boot " + id);
	// return skill;
	// return null;
	// use service used above
	System.out.println("call in controller");
	return service.getById(id);
    }

    @GetMapping("/skills/{name}/by-name")
    // public SkillCreate getById(@PathVariable("id") Long id) {
    public SkillView getByName(@PathVariable("name") String name) {

	System.out.println("call in controller");
	return service.getByName(name);
    }

    @PostMapping("/skills")
    // public void create(@RequestBody @Valid SkillCreate skill)
    public void create(@RequestBody @Valid SkillCreate dto) {
	service.create(dto);
	System.out.println("call in controller");

    }

}
