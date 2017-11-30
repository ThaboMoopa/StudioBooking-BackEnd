package com.studiobookingsheet.services.Impl;

import com.studiobookingsheet.domain.Technical;
import com.studiobookingsheet.repositories.TechnicalRepository;
import com.studiobookingsheet.services.TechnicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 2017/11/20.
 */
@Component
public class TechnicalServiceImpl implements TechnicalService {

    @Autowired
    private TechnicalRepository technicalRepository;

    @Override
    public Technical create(Technical technical) {
        return technicalRepository.save(technical);
    }

    @Override
    public Technical read(long id) {
        return technicalRepository.findOne(id);
    }

    @Override
    public Technical update(Technical technical) {
        return technicalRepository.save(technical);
    }

    @Override
    public void delete(long id) {
        technicalRepository.delete(id);

    }

    @Override
    public Iterable<Technical> findAll() {
        return technicalRepository.findAll();
    }
}
