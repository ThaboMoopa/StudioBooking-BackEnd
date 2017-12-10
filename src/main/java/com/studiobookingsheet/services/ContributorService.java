package com.studiobookingsheet.services;

import com.studiobookingsheet.domain.Contributor;

/**
 * Created by thabomoopa on 2017/11/17.
 */
public interface ContributorService {
    Contributor create(Contributor contributor);
    Contributor read(long id);
    Contributor update(Contributor contributor);
    void delete(long id);
    Contributor findByEmail(String email);
    Iterable<Contributor> findAll();
    Iterable<Contributor> findByName(String name);
    Iterable<Contributor> findByNameOrderByName(String name);
    void deleteById(long id);
}
