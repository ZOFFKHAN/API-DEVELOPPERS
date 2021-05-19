package fr.formation.developer.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developer.domain.dtos.DeveloperCreate;
import fr.formation.developer.domain.dtos.DeveloperUpdate;
import fr.formation.developer.domain.dtos.DeveloperView;
import fr.formation.developer.services.DevoloperService;

@RestController
@RequestMapping("/developers")
// in order to have the same root at local host and avoid redundancy susch as in @postmapping...

public class DevelopperController {

    private final DevoloperService service;

    public DevelopperController(DevoloperService service) {
	this.service = service;
    }

    @GetMapping("/{nickname}")
    public DeveloperView getById(@PathVariable("nickname") String nickname) {
	// at first the @GetMapping was performed on the Id (long Id)
	// and moved to nickname'pseudo that why now we have String
//	Developer developer = new Developer();
//	developer.setLastname("nom1 ");
//	developer.setFirstname("Prenom 1 ");
//	developer.setNickname(nickname);
//	LocalDate date = LocalDate.of(1911, 10, 20);
//	developer.setBirthDate(date);
	// changed in order to catch the setbirtDate in a variable
	// developer.setBirthDate(LocalDate.of(1967, 10, 15));
	System.out.println("call in controller");
	return service.getById(nickname);
	// return developer;

    }

    // @PostMapping("/developpers")
    @PostMapping
    // map le json ==> request body
    public void create(@Valid @RequestBody DeveloperCreate developer) {
	service.create(developer);
	System.out.println(developer);
    }

    /*
     * while patching the developper's : when using the 'Developper' as defined with
     * constrainss not null we've got the following out put : Partial object=null
     * null 1972-10-15 New object=toto khan 1972-10-15 that's why we have to update
     * the impacting @patching
     * 
     * => that mean creating a new class only for 'birth-date' called (here)
     * Developerupdate
     */

//    @PatchMapping("/{nickname}/birth-date")
//    public void updateBirthDate(@PathVariable("nickname") String nickname,
//	    @RequestBody Developer partial) {
//	System.out.println("Partial object=" + partial);
//	Developer developer = new Developer();
//	developer.setNickname(nickname); 
//	developer.setFirstname(partial.getFirstname()); 
//	developer.setLastname("khan");
//	developer.setBirthDate(partial.getBirthDate());
//	System.out.println("New object=" + developer);
//    }

    // The NewBirthDate comes from @RequestBody
    // now only
    // 'Update birth date of: toto with new date : 1972-10-15' instead of all the
    // fields
    // of 'Developper'

    @PatchMapping("/{nickname}/birth-date")
    public void updateBirthDate(@PathVariable("nickname") String nickname,
	    @Valid @RequestBody DeveloperUpdate NewBirthDate) {
	service.updateBirthDate(nickname, NewBirthDate);
	System.out.println("Patch birth-date called  in controller");
	System.out.println("Update birth date of: " + nickname + " with new date : " + NewBirthDate.getBirthDate());

    }

    @DeleteMapping("/{nickname}")
    public void deleteDeveloper(@PathVariable("nickname") String nickname) {
	service.deleteDeveloper(nickname);
	System.out.println("Delete Developer in controller : " + nickname);

    }

}
