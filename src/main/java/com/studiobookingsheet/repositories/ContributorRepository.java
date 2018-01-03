package com.studiobookingsheet.repositories;

import com.studiobookingsheet.domain.Contributor;
import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;

/**
 * Created by thabomoopa on 2017/11/17.
 */
public interface ContributorRepository extends CrudRepository<Contributor, Long> {
    Contributor findByEmail(String email);
    Iterable<Contributor> findAllByOrderByNameDesc();
    Iterable<Contributor> findByNameContainingIgnoreCase(String name);
    Contributor deleteById(long id); 

    //Contributor findByFirstnameStartingWith(String search)
}
