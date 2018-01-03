package com.studiobookingsheet.services.Impl;

import com.studiobookingsheet.domain.Colours;
import com.studiobookingsheet.repositories.ColoursRepository;
import com.studiobookingsheet.services.ColoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 26/11/2017.
 */
@Component
public class ColoursServiceImpl implements ColoursService {
    @Autowired
    ColoursRepository coloursRepository;

    @Override
    public Colours create(Colours colours) {
        return coloursRepository.save(colours);
    }

    @Override
    public Colours read(long id) {
        return coloursRepository.findOne(id);
    }

    @Override
    public Colours update(Colours colours) {
        return coloursRepository.save(colours);
    }

    @Override
    public void delete(long id) {
        coloursRepository.delete(id);
    }

    @Override
    public Iterable<Colours> findAll() {
        return coloursRepository.findAll();
    }
}
