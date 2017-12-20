package com.studiobookingsheet.services.Impl;

import com.studiobookingsheet.domain.ProgramSlot;
import com.studiobookingsheet.repositories.ProgramSlotRepository;
import com.studiobookingsheet.services.ProgramSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 2017/11/19.
 */
@Component
public class ProgramSlotServiceImpl implements ProgramSlotService{

    @Autowired
    private ProgramSlotRepository programSlotRepository;

    @Override
    public ProgramSlot create(ProgramSlot programSlot) {
        return programSlotRepository.save(programSlot);
    }

    @Override
    public ProgramSlot read(long id) {
        return programSlotRepository.findOne(id);
    }

    @Override
    public ProgramSlot update(ProgramSlot programSlot) {
        return programSlotRepository.save(programSlot);
    }

    @Override
    public void delete(long id) {
    programSlotRepository.delete(id);
    }

    @Override
    public Iterable<ProgramSlot> findByNameContaining(String search) {
        return programSlotRepository.findByNameContainingIgnoreCase(search);
    }

    @Override
    public Iterable<ProgramSlot> findAll() {
        return programSlotRepository.findAll();
    }

    @Override
    public ProgramSlot findByName(String name) {
        return programSlotRepository.findByNameIgnoreCase(name);
    }

    @Override
    public ProgramSlot findByTime(String time) {
        return programSlotRepository.findByTimeIgnoreCase(time);
    }
}
