package com.studiobookingsheet.services;

import com.studiobookingsheet.domain.StudioTimes;

/**
 * Created by thabomoopa on 2017/11/19.
 */
public interface StudioTimesService {
    StudioTimes create(StudioTimes times);
    StudioTimes read(long id);
    StudioTimes update(StudioTimes times);
    void delete(long id);
    Iterable<StudioTimes> findAll();
}
