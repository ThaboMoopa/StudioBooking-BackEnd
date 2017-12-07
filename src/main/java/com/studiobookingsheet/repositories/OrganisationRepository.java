package com.studiobookingsheet.repositories;

import com.studiobookingsheet.domain.Organisation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thabomoopa on 28/11/2017.
 */
public interface OrganisationRepository extends CrudRepository<Organisation, Long> {

    Organisation findByOrganisationName(String name);
}
