package com.studiobookingsheet.controller;

import com.studiobookingsheet.domain.Organisation;
import com.studiobookingsheet.factory.OrganisationFactory;
import com.studiobookingsheet.services.Impl.OrganisationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 28/11/2017.
 */
@Controller
@RequestMapping(path = "/organisation")
public class OrganisationController {

    private Organisation organisation;

    @Autowired
    private OrganisationServiceImpl organisationService;

    @CrossOrigin
    @GetMapping(path = "/addOrganisation")
    public @ResponseBody Organisation create(@RequestParam String organisationName, @RequestParam String contactDetails,
    @RequestParam String contactPerson, @RequestParam String webAddress)
    {
        Map<String, String> stringValues = new HashMap<String, String>();
        stringValues.put("organisationName", organisationName);
        stringValues.put("contactDetails", contactDetails);
        stringValues.put("contactPerson", contactPerson);
        stringValues.put("webAddress", webAddress);

        organisation = OrganisationFactory.getOrganisation(stringValues);
        return organisationService.create(organisation);
    }

    @CrossOrigin
    @GetMapping(path = "/readOrganisation")
    public @ResponseBody Organisation read(@RequestParam long id)
    {
        return organisationService.read(id);
    }
    @CrossOrigin
    @GetMapping(path = "/updateOrganisation")
    public @ResponseBody Organisation create(@RequestParam long id, @RequestParam String organisationName, @RequestParam String contactDetails,
                                             @RequestParam String contactPerson, @RequestParam String webAddress)
    {

        Organisation organisationUpdate = new Organisation.Builder()
                .id(id)
                .organisationName(organisationName)
                .contactDetails(contactDetails)
                .contactPerson(contactPerson)
                .webAddress(webAddress)
                .build();

        return organisationService.update(organisationUpdate);
    }
    @CrossOrigin
    @GetMapping(path = "/deleteOrganisation")
    public @ResponseBody void delete(@RequestParam long id)
    {
        organisationService.delete(id);
    }

    @CrossOrigin
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<Organisation> findAll()
    {
        return organisationService.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "/findByName")
    public @ResponseBody Organisation found(@RequestParam String name)
    {
        return organisationService.findByOrganisationName(name);
    }
    @CrossOrigin
    @GetMapping(path = "/findByOrganisationId")
    public @ResponseBody String organisationId(@RequestParam long id)
    {
        organisation = organisationService.read(id);

        return organisation.getOrganisationName();
    }
    @CrossOrigin
    @GetMapping(path = "/findByContainingName")
    public @ResponseBody Organisation findByContainingName(@RequestParam String name)
    {

        return organisation.getOrganisationName();
    }

}
