package com.studiobookingsheet.services;

import com.studiobookingsheet.domain.ProgramSlot;

/**
 * Created by thabomoopa on 2017/11/19.
 */
public interface ProgramSlotService {
    ProgramSlot create(ProgramSlot programSlot);
    ProgramSlot read(long id);
    ProgramSlot update(ProgramSlot programSlot);
    void delete(long id);
    Iterable<ProgramSlot> findByNameContaining(String search);
    Iterable<ProgramSlot> findAll();
    ProgramSlot findByName(String name);
}
