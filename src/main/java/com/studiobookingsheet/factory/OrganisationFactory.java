package com.studiobookingsheet.factory;

import com.studiobookingsheet.domain.Organisation;

import java.util.Map;

/**
 * Created by thabomoopa on 28/11/2017.
 */
public class OrganisationFactory {
    public static Organisation getOrganisation(Map<String,String> stringValues)
    {
        Organisation organisation = new Organisation.Builder()
                .organisationName(stringValues.get("organisationName"))
                .contactDetails(stringValues.get("contactDetails"))
                .contactPerson(stringValues.get("contactPerson"))
                .webAddress(stringValues.get("webAddress"))
                .build();
        return organisation;

    }
}
