package com.studiobookingsheet.DataLoading;

import com.studiobookingsheet.domain.Organisation;
import com.studiobookingsheet.factory.OrganisationFactory;
import com.studiobookingsheet.services.Impl.OrganisationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 28/11/2017.
 */
@Component
public class OrganisationLoad {

    private Organisation organisation;

    private OrganisationServiceImpl organisationService;

    @Autowired
    public void loadOrganisation(OrganisationServiceImpl organisationService)
    {
        this.organisationService = organisationService;
        load();
    }

    public void load()
    {
        Map<String, String> stringValues = new HashMap<String, String>();
        stringValues.put("organisationName", "Capitec");
        stringValues.put("contactDetails", "0123341200");
        stringValues.put("contactPerson", "0849262255");
        stringValues.put("webAddress", "www.capitec.co.za");

        Map<String, String> stringValues2 = new HashMap<String, String>();
        stringValues2.put("organisationName", "Liberty");
        stringValues2.put("contactDetails", "0123341200");
        stringValues2.put("contactPerson", "0849262255");
        stringValues2.put("webAddress", "www.capitec.co.za");

        organisation = OrganisationFactory.getOrganisation(stringValues);
        organisationService.create(organisation);



        organisation = OrganisationFactory.getOrganisation(stringValues2);
        organisationService.create(organisation);

    }
}
