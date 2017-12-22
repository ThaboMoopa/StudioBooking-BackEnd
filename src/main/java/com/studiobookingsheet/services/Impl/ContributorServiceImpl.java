package com.studiobookingsheet.services.Impl;

import com.studiobookingsheet.domain.Contributor;
import com.studiobookingsheet.repositories.ContributorRepository;
import com.studiobookingsheet.services.ContributorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 2017/11/17.
 */
@Component
public class ContributorServiceImpl implements ContributorService {

    @Autowired
    ContributorRepository contributorRepository;

    @Override
    public Contributor create(Contributor contributor) {
        return contributorRepository.save(contributor);
    }

    @Override
    public Contributor read(long id) {
        return contributorRepository.findOne(id);
    }

    @Override
    public Contributor update(Contributor contributor) {
        return contributorRepository.save(contributor);
    }

    @Override
    public void delete(long id) {
        contributorRepository.delete(id);
    }

    @Override
    public Contributor findByEmail(String email) {

        return contributorRepository.findByEmail(email);
    }

    @Override
    public Iterable<Contributor> findAll() {
        return contributorRepository.findAll();
    }

    @Override
    public Iterable<Contributor> findByName(String name) {
        return contributorRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public void deleteById(long id) {
        contributorRepository.deleteById(id);
    }

    @Override
    public Iterable<Contributor> findAllOrderByNameAsc() {
        return contributorRepository.findAllByOrderByNameAsc();
    }

    //    @Override
//    public Iterable<Contributor> findByNameOrSurname(String search) {
//        return contributorRepository.findByNameOrSurnameContaining(search);
//    }
}
