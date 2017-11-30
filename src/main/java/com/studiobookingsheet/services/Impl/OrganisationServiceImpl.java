package com.studiobookingsheet.services.Impl;

import com.studiobookingsheet.domain.Organisation;
import com.studiobookingsheet.repositories.OrganisationRepository;
import com.studiobookingsheet.services.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 28/11/2017.
 */
@Component
public class OrganisationServiceImpl implements OrganisationService{

    @Autowired
    OrganisationRepository organisationRepository;

    @Override
    public Organisation create(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    @Override
    public Organisation read(long id) {
        return organisationRepository.findOne(id);
    }

    @Override
    public Organisation update(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    @Override
    public void delete(long id) {
        organisationRepository.delete(id);
    }

    @Override
    public Iterable<Organisation> findAll() {
        return organisationRepository.findAll();
    }

    @Override
    public Organisation findByOrganisationName(String name) {
        return organisationRepository.findByOrganisationName(name);
    }
}
