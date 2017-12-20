package com.studiobookingsheet.services;

import com.studiobookingsheet.domain.Organisation;

/**
 * Created by thabomoopa on 28/11/2017.
 */
public interface OrganisationService {
    Organisation create(Organisation organisation);
    Organisation read(long id);
    Organisation update(Organisation organisation);
    void delete(long id);
    Iterable<Organisation> findAll();
    Organisation findByOrganisationName(String name);
    Iterable<Organisation>  Organisation findByOrganisationName(String name);

}
