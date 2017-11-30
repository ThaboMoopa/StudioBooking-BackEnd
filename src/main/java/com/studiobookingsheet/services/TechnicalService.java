package com.studiobookingsheet.services;

import com.studiobookingsheet.domain.Technical;

import java.util.Iterator;

/**
 * Created by thabomoopa on 2017/11/20.
 */
public interface TechnicalService {
    Technical create(Technical technical);
    Technical read(long id);
    Technical update(Technical technical);
    void delete(long id);
    Iterable<Technical> findAll();
}
