package com.studiobookingsheet.controller;

import com.studiobookingsheet.domain.Contributor;
import com.studiobookingsheet.domain.Organisation;
import com.studiobookingsheet.factory.ContributorFactory;
import com.studiobookingsheet.services.Impl.ContributorServiceImpl;
import com.studiobookingsheet.services.Impl.OrganisationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.ServerEndpoint;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/11/17.
 */
@Controller
@RequestMapping(path = "/contributor")
public class ContributorController {

    private Contributor contributor;
    private Organisation organisation;

    @Autowired
    ContributorServiceImpl contributorService;

    @Autowired
    OrganisationServiceImpl organisationService;

    @CrossOrigin
    @PostMapping(path = "/{organisationId}/addContributor")
    public @ResponseBody Contributor create(@PathVariable long organisationId,
                                            @RequestParam String name, @RequestParam String surname,
                                            @RequestParam String email,
                                            @RequestParam String position, @RequestParam String contact,
                                            @RequestParam String additionalContact)
    {
        Map<String, String> stringValues = new HashMap<String, String>();

        stringValues.put("name", name);
        stringValues.put("surname", surname);
        stringValues.put("email", email);
        stringValues.put("position", position);
        stringValues.put("contact", contact);
        stringValues.put("additionalContact", additionalContact);

        organisation =  organisationService.read(organisationId);

        contributor = ContributorFactory.getContributor(stringValues, organisation);
        return contributorService.create(contributor);
    }

    @CrossOrigin
    @GetMapping(path = "/readContributor")
    public @ResponseBody Contributor read(@RequestParam long id)
    {
        return contributorService.read(id);
    }

    @CrossOrigin
    @PutMapping(path = "/{organisationId}/updateContributor")
    public @ResponseBody String update(@PathVariable long organisationId, @RequestParam long id, @RequestParam String name,
                                       @RequestParam String surname, @RequestParam String email,
                                       @RequestParam String position, @RequestParam String contact,
                                       @RequestParam String additionalContact)
    {

        organisation =  organisationService.read(organisationId);
        Contributor contributorUpdate = new Contributor.Builder()
                .id(id)
                .name(name)
                .surname(surname)
                .email(email)
                .position(position)
                .contact(contact)
                .additionalContact(additionalContact)
                .organisation(organisation)
                .build();

        contributorService.update(contributorUpdate);
        return "updated";
    }

    @CrossOrigin
    @GetMapping(path="/findByEmail")
    public @ResponseBody String findByEmail(@RequestParam String email)
    {
        contributor = contributorService.findByEmail(email);

        if(contributor.getEmail().equals(email))
        {
            return "Exists";
        }
        else
            return "Does not Exist";

    }

    @CrossOrigin
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<Contributor> findAll()
    {
        return contributorService.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "/Search")
    public @ResponseBody Iterable<Contributor> findByName(@RequestParam String search)
    {
        return contributorService.findByName(search);
    }

    @CrossOrigin
    @GetMapping(path = "/findByContributorId")
    public @ResponseBody String readById(@RequestParam long id)
    {
        contributor = contributorService.read(id);
        return contributor.toString();
    }

    @CrossOrigin
    @GetMapping(path = "/deleteContributor")
    public @ResponseBody void deleteContributor(@RequestParam long id)
    {
        contributorService.delete(id);
        //return contributor.toString();
    }

    @CrossOrigin
    @GetMapping(path = "/delete")
    public @ResponseBody void deleteById(@RequestParam long id)
    {
        contributorService.deleteById(id);
        //return contributor.toString();
    }

}
