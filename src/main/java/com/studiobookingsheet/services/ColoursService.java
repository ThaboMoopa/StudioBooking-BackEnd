package com.studiobookingsheet.services;

import com.studiobookingsheet.domain.Colours;

/**
 * Created by thabomoopa on 26/11/2017.
 */
public interface ColoursService {
    Colours create(Colours colours);
    Colours read(long id);
    Colours update(Colours colours);
    void delete(long id);
    Iterable<Colours> findAll();
}
