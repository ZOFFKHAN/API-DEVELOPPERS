package fr.formation.developer.controllers;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Developer;
import domain.DeveloperUpdate;

@RestController
@RequestMapping("/developers")
// in order to have the same root at local host and avoid redundancy susch as in @postmapping...

public class DevelopperController {

    @GetMapping("/{nickname}")
    public Developer getById1(@PathVariable("nickname") String nickname) {
	// at first the @GetMapping was performed on the Id (long Id)
	// and moved to nickname'pseudo that why now we have String
	Developer developer = new Developer();
	developer.setLastname("nom1 ");
	developer.setFirstname("Prenom 1 ");
	developer.setNickname(nickname);
	LocalDate date = LocalDate.of(1911, 10, 20);
	developer.setBirthDate(date);
	// changed in order to catch the setbirtDate in a variable
	// developer.setBirthDate(LocalDate.of(1967, 10, 15));
	return developer;

    }

    // @PostMapping("/developpers")
    @PostMapping
    // map le json ==> request body
    public void create1(@Valid @RequestBody Developer developer) {

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
	System.out.println("Update birth date of: " + nickname + " with new date : " + NewBirthDate.getBirthDate());
    }

}
