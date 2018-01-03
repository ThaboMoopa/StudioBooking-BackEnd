package com.studiobookingsheet.services.Impl;

import com.studiobookingsheet.domain.StudioTimes;
import com.studiobookingsheet.repositories.StudioTimesRepository;
import com.studiobookingsheet.services.StudioTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 2017/11/19.
 */
@Component
public class StudioTimesServiceImpl implements StudioTimesService {
    @Autowired
    StudioTimesRepository studioTimesRepository;

    @Override
    public StudioTimes create(StudioTimes times) {
        return studioTimesRepository.save(times);
    }

    @Override
    public StudioTimes read(long id) {
        return studioTimesRepository.findOne(id);
    }

    @Override
    public StudioTimes update(StudioTimes times) {
        return studioTimesRepository.save(times);
    }

    @Override
    public void delete(long id) {
            studioTimesRepository.delete(id);
    }

    @Override
    public Iterable<StudioTimes> findAll() {
        return studioTimesRepository.findAll();
    }
}
