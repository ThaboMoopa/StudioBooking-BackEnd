package com.studiobookingsheet.factory;

import com.studiobookingsheet.domain.Contributor;
import com.studiobookingsheet.domain.Organisation;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/11/17.
 */
public class ContributorFactory {
    public static Contributor getContributor(Map<String, String> stringValues, Organisation organistation)
    {
        Contributor contributor = new Contributor.Builder()
                .name(stringValues.get("name"))
                .surname(stringValues.get("surname"))
                .email(stringValues.get("email"))
                .position(stringValues.get("position"))
                .contact(stringValues.get("contact"))
                .additionalContact(stringValues.get("additionalContact"))
                .organisation(organistation)
                .build();
        return contributor;
    }
}
