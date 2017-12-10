package com.studiobookingsheet.repositories;

import com.studiobookingsheet.domain.Contributor;
import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;

/**
 * Created by thabomoopa on 2017/11/17.
 */
public interface ContributorRepository extends CrudRepository<Contributor, Long> {
    Contributor findByEmail(String email);
    //Contributor findByNameOrSurname(String name);
    Iterable<Contributor> findByNameContainingIgnoreCase(String name);
    Iterable<Contributor> findByNameContainingIgnoreCaseOrderByName(String name);
    Contributor deleteById(long id); 

    //Contributor findByFirstnameStartingWith(String search)
}
